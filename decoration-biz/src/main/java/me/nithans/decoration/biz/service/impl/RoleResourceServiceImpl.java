package me.nithans.decoration.biz.service.impl;

import me.nithans.decoration.biz.service.RoleResourceService;
import me.nithans.decoration.dal.domain.decoration.RoleResource;
import me.nithans.decoration.dal.domain.decoration.RoleResourceCriteria;
import me.nithans.decoration.dal.domain.decoration.UserRole;
import me.nithans.decoration.dal.domain.decoration.UserRoleCriteria;
import me.nithans.decoration.dal.mapper.decoration.RoleResourceMapper;
import me.nithans.decoration.dal.mapper.decoration.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleResourceServiceImpl implements RoleResourceService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private RoleResourceMapper roleResourceMapper;

    @Override
    public void deleteRoleResourceByResourceId(Integer resourceId) {
        RoleResourceCriteria roleResourceCriteria = new RoleResourceCriteria();
        roleResourceCriteria.createCriteria().andResourceIdEqualTo(resourceId);
        roleResourceMapper.deleteByExample(roleResourceCriteria);
    }

    @Override
    public List<RoleResource> findRoleResourceByUserId(Integer userId) {
        UserRoleCriteria userRoleCriteria = new UserRoleCriteria();
        userRoleCriteria.createCriteria().andUserIdEqualTo(userId);
        List<UserRole> userRoleList = userRoleMapper.selectByExample(userRoleCriteria);
        if (CollectionUtils.isEmpty(userRoleList)) {
            return Collections.emptyList();
        }
        List<Integer> roleIdList = userRoleList.stream().map(item -> item.getRoleId())
            .collect(Collectors.toList());
        RoleResourceCriteria roleResourceCriteria = new RoleResourceCriteria();
        roleResourceCriteria.createCriteria().andRoleIdIn(roleIdList);
        List<RoleResource> roleResourceList = roleResourceMapper
            .selectByExample(roleResourceCriteria);
        return roleResourceList;
    }
}
