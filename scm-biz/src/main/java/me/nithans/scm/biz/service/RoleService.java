package me.nithans.scm.biz.service;

import java.util.List;
import me.nithans.scm.biz.bean.vo.RoleVO;
import me.nithans.scm.dal.domain.scm.Role;

public interface RoleService {

    void addRole(String name, String description);

    void deleteRole(Integer roleId);

    List<Role> findRoleByBatchId(List<Integer> roleIdList);

    List<RoleVO> convertToRoleVO(List<Role> roleList);

    RoleVO convertToRoleVO(Role role);
}
