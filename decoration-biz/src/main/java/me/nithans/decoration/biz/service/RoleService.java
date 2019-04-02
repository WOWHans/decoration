package me.nithans.decoration.biz.service;

import java.util.List;
import me.nithans.decoration.biz.bean.vo.RoleVO;
import me.nithans.decoration.dal.domain.decoration.Role;

public interface RoleService {

    void addRole(String name, String description);

    void deleteRole(Integer roleId);

    List<Role> findRoleByBatchId(List<Integer> roleIdList);

    List<RoleVO> convertToRoleVO(List<Role> roleList);

    RoleVO convertToRoleVO(Role role);
}
