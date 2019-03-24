package me.nithans.decoration.biz.service.impl;

import me.nithans.decoration.biz.service.RoleService;
import me.nithans.decoration.biz.service.UserRoleService;
import me.nithans.decoration.dal.domain.decoration.Role;
import me.nithans.decoration.dal.mapper.decoration.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public void addRole(String name, String description) {
        Role role = new Role();
        role.setName(name);
        role.setDescription(description);
        roleMapper.insertSelective(role);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void deleteRole(Integer roleId) {
        roleMapper.deleteByPrimaryKey(roleId);
        userRoleService.deleteUserRoleByRoleId(roleId);
    }
}
