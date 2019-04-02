package me.nithans.decoration.biz.service.impl;

import me.nithans.decoration.biz.service.UserRoleService;
import me.nithans.decoration.dal.domain.decoration.Role;
import me.nithans.decoration.dal.domain.decoration.UserRole;
import me.nithans.decoration.dal.domain.decoration.UserRoleCriteria;
import me.nithans.decoration.dal.mapper.decoration.UserRoleMapper;
import me.nithans.decoration.dal.mapper.decoration.ext.UserRoleExtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleExtMapper userRoleExtMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public void addUserRole(Integer userId, List<Integer> roleIdList) {
        List<UserRole> userRoleList = roleIdList.stream().map(roleId -> {
            UserRole userRole = new UserRole();
            userRole.setUserId(userId);
            userRole.setRoleId(roleId);
            return userRole;
        }).collect(Collectors.toList());
        userRoleExtMapper.batchInsert(userRoleList);
    }

    @Override
    public void deleteUserRoleByUserId(Integer userId) {
        UserRoleCriteria userRoleCriteria = new UserRoleCriteria();
        userRoleCriteria.createCriteria().andUserIdEqualTo(userId);
        userRoleMapper.deleteByExample(userRoleCriteria);
    }

    @Override
    public void deleteUserRoleByRoleId(Integer roleId) {
        UserRoleCriteria userRoleCriteria = new UserRoleCriteria();
        userRoleCriteria.createCriteria().andRoleIdEqualTo(roleId);
        userRoleMapper.deleteByExample(userRoleCriteria);
    }

    @Override
    public List<UserRole> findRoleByUserId(Integer userId) {
        UserRoleCriteria criteria = new UserRoleCriteria();
        criteria.createCriteria().andUserIdEqualTo(userId);
        return userRoleMapper.selectByExample(criteria);
    }
}
