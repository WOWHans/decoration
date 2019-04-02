package me.nithans.decoration.biz.service;

import java.util.List;
import me.nithans.decoration.dal.domain.decoration.UserRole;

public interface UserRoleService {

    void addUserRole(Integer userId, List<Integer> roleIdList);

    void deleteUserRoleByUserId(Integer userId);

    void deleteUserRoleByRoleId(Integer roleId);

    List<UserRole> findRoleByUserId(Integer userId);
}
