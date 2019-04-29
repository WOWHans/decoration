package me.nithans.scm.biz.service;

import java.util.List;
import me.nithans.scm.dal.domain.scm.UserGroup;

public interface UserGroupService {

    void addUserGroup(Integer userId, List<Integer> groupIdList);

    void deleteUserGroupByUserId(Integer userId);

    void deleteUserGroupByGroupId(Integer groupId);

    List<UserGroup> findUserGroupByUserId(Integer userId);
}
