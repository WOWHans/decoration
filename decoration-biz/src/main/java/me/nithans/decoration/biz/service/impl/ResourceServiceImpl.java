package me.nithans.decoration.biz.service.impl;

import me.nithans.decoration.biz.service.ResourceService;
import me.nithans.decoration.biz.service.RoleResourceService;
import me.nithans.decoration.common.pojo.query.ResourceQuery;
import me.nithans.decoration.dal.domain.decoration.Resource;
import me.nithans.decoration.dal.domain.decoration.ResourceCriteria;
import me.nithans.decoration.dal.mapper.decoration.ResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private RoleResourceService roleResourceService;
    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    public Set<String> findResouceByUserId(Integer userId) {
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
}
