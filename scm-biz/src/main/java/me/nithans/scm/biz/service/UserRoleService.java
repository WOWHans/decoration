package me.nithans.scm.biz.service;

import java.util.List;
import me.nithans.scm.dal.domain.scm.UserRole;

public interface UserRoleService {

    void addUserRole(Integer userId, List<Integer> roleIdList);

    void deleteUserRoleByUserId(Integer userId);

    void deleteUserRoleByRoleId(Integer roleId);

    List<UserRole> findRoleByUserId(Integer userId);
}
