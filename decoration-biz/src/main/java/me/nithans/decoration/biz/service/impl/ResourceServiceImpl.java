package me.nithans.decoration.biz.service.impl;

import com.google.common.collect.*;
import me.nithans.decoration.biz.bean.vo.ResourceVO;
import me.nithans.decoration.biz.service.ResourceService;
import me.nithans.decoration.biz.service.RoleResourceService;
import me.nithans.decoration.common.pojo.query.ResourceQuery;
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
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private RoleResourceService roleResourceService;
    @Autowired
    private ResourceMapper resourceMapper;

    private Map<Resource,Set<Resource>> menuMap = Maps.newConcurrentMap();

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
        Set<String> resourceIdList = roleResourceService.findRoleResourceByUserId(userId).stream().map(item -> String.valueOf(item.getResourceId())).collect(Collectors.toSet());
        return resourceIdList;
    }

    @Override
    public List<Resource> findResourceByQuery(ResourceQuery query) {
        ResourceCriteria criteria = new ResourceCriteria();
        ResourceCriteria.Criteria c = criteria.createCriteria();
        if (null != query.getId()) {
            c.andIdEqualTo(query.getId());
        }
        if (!StringUtils.isEmpty(query.getUrl())) {
            c.andUrlEqualTo(query.getUrl());
        }
        if (null != query.getCode()) {
            c.andCodeEqualTo(query.getCode());
        }
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
    public List<ResourceVO> findResourceByRoleId(Integer roleId) {
        List<RoleResource> roleResourceList = roleResourceService.findRoleResourceByUserId(roleId);
        List<ResourceVO> resourceVOList = Lists.newArrayList();
        roleResourceList.forEach(roleResource -> {
            ResourceQuery query = new ResourceQuery();
            query.setId(roleResource.getResourceId());
            List<Resource> resourceList = findResourceByQuery(query);
            if (!CollectionUtils.isEmpty(resourceList)) {
                Resource resource = resourceList.get(0);
                if (!menuMap.containsKey(resource.getParentId())) {
                    menuMap.put(findResourceById(resource.getParentId()).get(0), Sets.newHashSet(resource));
                } else {
                    menuMap.get(resource.getParentId()).add(resource);
                }
                ResourceVO childResourceVO = convertToResourceVO(resource);

                resourceVOList.add(childResourceVO);
            }
        });
        findComplexResource(resourceVOList);
        return convertToTree();
    }


    /**
     * 根据分配的资源获取整个相关权限的菜单树 单一菜单树
     * @param childResourceVO
     * @return
     */
    private ResourceVO findParentResource(ResourceVO childResourceVO) {
        List<Resource> parentResourceList = findResourceById(childResourceVO.getParentId());
        ResourceVO parentResourceVO = childResourceVO;
        if (!CollectionUtils.isEmpty(parentResourceList)) {
            Resource parentResource = parentResourceList.get(0);
            parentResourceVO = convertToResourceVO(parentResource);
            parentResourceVO.setChildResourceList(Lists.newArrayList(childResourceVO));
            if (!menuMap.containsKey(parentResource)) {
                menuMap.put(parentResource, Sets.newHashSet(convertToResource(childResourceVO)));
            } else {
                menuMap.get(parentResource).add(convertToResource(childResourceVO));
            }
            if (parentResourceVO.getParentId() != null) {
                parentResourceVO = findParentResource(parentResourceVO);
            }
        }
        return parentResourceVO;
    }

    /**
     * 简单想法是把所有有权限的菜单全保存在Set里，然后再进行建树
     *
     * @param childRescourceVOList
     * @return
     */
    private List<ResourceVO> findComplexResource(List<ResourceVO> childRescourceVOList) {
        List<ResourceVO> resourceVOList = Lists.newArrayList();
//        Table<Integer,Integer, List<ResourceVO>> table = HashBasedTable.create();
        menuMap.clear();
        childRescourceVOList.forEach(
                childResource -> {
                    ResourceVO resourceVO = findParentResource(childResource);
                    if (CollectionUtils.isEmpty(resourceVOList)) {
                        resourceVOList.add(resourceVO);
                    }
                    resourceVOList.add(resourceVO);
                }
        );
        return resourceVOList;
    }

    private List<ResourceVO> convertToTree() {
        List<ResourceVO> menuTrees = Lists.newArrayList();
        // 获取最上层父级菜单
        List<Resource> parentResourceList = menuMap.keySet().stream().filter(key -> key.getParentId() == null).collect(Collectors.toList());
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
            resourceVO.setChildResourceList(childList.stream().map(this::convertToResourceVO).collect(Collectors.toList()));
            List<ResourceVO> parentList = resourceVO.getChildResourceList();
            parentList.forEach(
                    childParent -> buildMenuTree(childParent)
            );
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
        resource.setUrl(resourceVO.getUrl());
        resource.setParentId(resourceVO.getParentId());
        resource.setType(resourceVO.getType());
        return resource;
    }
}
