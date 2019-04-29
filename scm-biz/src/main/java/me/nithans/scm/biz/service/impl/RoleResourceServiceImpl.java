package me.nithans.scm.biz.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import me.nithans.scm.biz.service.RoleResourceService;
import me.nithans.scm.dal.domain.scm.RoleResource;
import me.nithans.scm.dal.domain.scm.RoleResourceCriteria;
import me.nithans.scm.dal.domain.scm.UserRole;
import me.nithans.scm.dal.domain.scm.UserRoleCriteria;
import me.nithans.scm.dal.mapper.scm.RoleResourceMapper;
import me.nithans.scm.dal.mapper.scm.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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
