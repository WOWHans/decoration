package me.nithans.decoration.biz.service.impl;

import me.nithans.decoration.biz.service.ResourceService;
import me.nithans.decoration.biz.service.RoleResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private RoleResourceService roleResourceService;

    @Override
    public Set<String> findResouceByUserId(Integer userId) {
        Set<String> resourceIdList = roleResourceService.findRoleResourceByUserId(userId).stream().map(item -> String.valueOf(item.getResourceId())).collect(Collectors.toSet());
        return resourceIdList;
    }
}
