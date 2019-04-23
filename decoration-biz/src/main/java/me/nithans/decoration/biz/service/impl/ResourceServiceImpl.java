package me.nithans.decoration.biz.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import me.nithans.decoration.biz.bean.vo.ResourceVO;
import me.nithans.decoration.biz.service.ResourceService;
import me.nithans.decoration.biz.service.RoleResourceService;
import me.nithans.decoration.biz.service.UserRoleService;
import me.nithans.decoration.common.exception.DecorationException;
import me.nithans.decoration.dal.domain.decoration.Resource;
import me.nithans.decoration.dal.domain.decoration.ResourceCriteria;
import me.nithans.decoration.dal.domain.decoration.RoleResource;
import me.nithans.decoration.dal.mapper.decoration.ResourceMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private RoleResourceService roleResourceService;
    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private ResourceMapper resourceMapper;

    private Map<Resource, Set<Resource>> menuMap = Maps.newConcurrentMap();

    @Override
    public void addResource(ResourceVO resourceVO) {
        Resource resource = new Resource();
        BeanUtils.copyProperties(resourceVO, resource);
        resourceMapper.insertSelective(resource);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void deleteResource(Integer resourceId) {
        resourceMapper.deleteByPrimaryKey(resourceId);
        roleResourceService.deleteRoleResourceByResourceId(resourceId);
    }

    @Override
    public Set<String> findResourceByUserId(Integer userId) {
        Set<String> resourceIdList = roleResourceService.findRoleResourceByUserId(userId).stream()
            .map(item -> String.valueOf(item.getResourceId())).collect(Collectors.toSet());
        return resourceIdList;
    }

    @Override
    public List<Resource> findResourceByUrl(String url) {
        ResourceCriteria criteria = new ResourceCriteria();
        criteria.createCriteria().andUrlEqualTo(url);
        return resourceMapper.selectByExample(criteria);
    }

    @Override
    public List<Resource> findResourceById(Integer id) {
        if (id == null) {
            return Lists.newArrayList();
        }
        ResourceCriteria criteria = new ResourceCriteria();
        ResourceCriteria.Criteria c = criteria.createCriteria();
        c.andIdEqualTo(id);
        return resourceMapper.selectByExample(criteria);
    }

    @Override
    public List<ResourceVO> findResourceVOByUserId(Integer userId) throws DecorationException {
        List<RoleResource> roleResourceList = roleResourceService.findRoleResourceByUserId(userId);
        if (CollectionUtils.isEmpty(roleResourceList)) {
            throw new DecorationException("该用户无权限访问");
        }
        roleResourceList = roleResourceList.stream().distinct().collect(Collectors.toList());
        return buildTreeMenu(roleResourceList);
    }

    @Override
    public List<ResourceVO> findResourceByRoleId(Integer roleId) {
        List<RoleResource> roleResourceList = roleResourceService.findRoleResourceByUserId(roleId);
        return buildTreeMenu(roleResourceList);
    }

    private List<ResourceVO> buildTreeMenu(List<RoleResource> roleResourceList) {
        List<Resource> resourceList = Lists.newArrayList();
        roleResourceList.forEach(roleResource -> {
            List<Resource> resourceByRoleList = findResourceById(roleResource.getResourceId());
            if (!CollectionUtils.isEmpty(resourceByRoleList)) {
                Resource resource = resourceByRoleList.get(0);
                if (!menuMap.containsKey(resource.getParentId())) {
                    menuMap.put(findResourceById(resource.getParentId()).get(0),
                        Sets.newHashSet(resource));
                } else {
                    menuMap.get(resource.getParentId()).add(resource);
                }
                resourceList.add(resource);
            }
        });
        buildResourceTree(resourceList);
        return convertToTree();
    }

    /**
     * 根据分配的资源获取整个相关权限的菜单树 单一菜单树
     */
    private Resource findParentResource(Resource resource) {
        List<Resource> parentResourceList = findResourceById(resource.getParentId());
        Resource parentResource = resource;
        if (!CollectionUtils.isEmpty(parentResourceList)) {
            parentResource = parentResourceList.get(0);
            if (!menuMap.containsKey(parentResource)) {
                menuMap.put(parentResource, Sets.newHashSet(resource));
            } else {
                menuMap.get(parentResource).add(resource);
            }
            if (resource.getParentId() != null) {
                findParentResource(parentResource);
            }
        }
        return parentResource;
    }

    /**
     * 简单想法是把所有有权限的菜单全保存在Set里，然后再进行建树
     */
    private List<Resource> buildResourceTree(List<Resource> childResourceVOList) {
        List<Resource> resourceList = Lists.newArrayList();
        menuMap.clear();
        childResourceVOList.forEach(
            childResource -> {
                Resource resource = findParentResource(childResource);
                resourceList.add(resource);
            }
        );
        return resourceList;
    }

    private List<ResourceVO> convertToTree() {
        List<ResourceVO> menuTrees = Lists.newArrayList();
        // 获取最上层父级菜单
        List<Resource> parentResourceList = menuMap.keySet().stream()
            .filter(key -> key.getParentId() == null).collect(Collectors.toList());
        // 通过父级菜单的Id 去找 map里的key 然后将value塞入父级菜单的自己菜单内，子级菜单做ke层层递归
        parentResourceList.forEach(parent -> {
            ResourceVO resourceVO = convertToResourceVO(parent);
            menuTrees.add(buildMenuTree(resourceVO));
        });
        return menuTrees;
    }

    private ResourceVO buildMenuTree(ResourceVO resourceVO) {
        Set<Resource> childList = menuMap.get(convertToResource(resourceVO));
        if (childList != null) {
            resourceVO.setChildResourceList(
                childList.stream().map(this::convertToResourceVO).collect(Collectors.toList()));
            List<ResourceVO> parentList = resourceVO.getChildResourceList();
            parentList.forEach(this::buildMenuTree);
        }
        return resourceVO;
    }

    private ResourceVO convertToResourceVO(Resource resource) {
        ResourceVO resourceVO = new ResourceVO();
        resourceVO.setResourceId(resource.getId());
        resourceVO.setCode(resource.getCode());
        resourceVO.setName(resource.getName());
        resourceVO.setUrl(resource.getUrl());
        resourceVO.setParentId(resource.getParentId());
        resourceVO.setType(resource.getType());
        return resourceVO;
    }

    private Resource convertToResource(ResourceVO resourceVO) {
        Resource resource = new Resource();
        resource.setId(resourceVO.getResourceId());
        resource.setCode(resourceVO.getCode());
        resource.setName(resourceVO.getName());
        resource.setIcon(resourceVO.getIcon());
        resource.setComponent(resourceVO.getComponent());
        resource.setUrl(resourceVO.getUrl());
        resource.setParentId(resourceVO.getParentId());
        resource.setType(resourceVO.getType());
        return resource;
    }
}
