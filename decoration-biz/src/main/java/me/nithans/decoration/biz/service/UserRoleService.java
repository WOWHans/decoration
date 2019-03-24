package me.nithans.decoration.biz.service;

import java.util.List;

public interface UserRoleService {

    void addUserRole(Integer userId, List<Integer> roleIdList);

    void deleteUserRoleByUserId(Integer userId);

    void deleteUserRoleByRoleId(Integer roleId);
}
