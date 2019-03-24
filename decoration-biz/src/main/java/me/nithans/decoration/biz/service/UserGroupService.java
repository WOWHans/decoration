package me.nithans.decoration.biz.service;

import java.util.List;

public interface UserGroupService {

    void addUserGroup(Integer userId, List<Integer> groupIdList);

    void deleteUserGroupByUserId(Integer userId);
}
