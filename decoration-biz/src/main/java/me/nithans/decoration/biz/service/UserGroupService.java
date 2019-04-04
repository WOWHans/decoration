package me.nithans.decoration.biz.service;

import java.util.List;
import me.nithans.decoration.dal.domain.decoration.UserGroup;

public interface UserGroupService {

    void addUserGroup(Integer userId, List<Integer> groupIdList);

    void deleteUserGroupByUserId(Integer userId);

    void deleteUserGroupByGroupId(Integer groupId);

    List<UserGroup> findUserGroupByUserId(Integer userId);
}
