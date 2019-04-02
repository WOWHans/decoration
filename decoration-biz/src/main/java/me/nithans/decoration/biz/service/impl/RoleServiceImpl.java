package me.nithans.decoration.biz.service.impl;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import me.nithans.decoration.biz.bean.vo.RoleVO;
import me.nithans.decoration.biz.service.RoleService;
import me.nithans.decoration.biz.service.UserRoleService;
import me.nithans.decoration.dal.domain.decoration.Role;
import me.nithans.decoration.dal.domain.decoration.RoleCriteria;
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

    @Override
    public List<Role> findRoleByBatchId(List<Integer> roleIdList) {
        RoleCriteria criteria = new RoleCriteria();
        criteria.createCriteria().andIdIn(roleIdList);
        return roleMapper.selectByExample(criteria);
    }

    @Override
    public List<RoleVO> convertToRoleVO(List<Role> roleList) {
        return roleList.stream().map(this::convertToRoleVO).collect(Collectors.toList());
    }

    @Override
    public RoleVO convertToRoleVO(Role role) {
        RoleVO roleVO = new RoleVO();
        roleVO.setRoleId(role.getId());
        roleVO.setRoleName(role.getName());
        roleVO.setDescription(role.getDescription());
        return roleVO;
    }
}
