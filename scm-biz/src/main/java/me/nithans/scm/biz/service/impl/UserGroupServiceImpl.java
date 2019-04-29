package me.nithans.scm.biz.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import me.nithans.scm.biz.service.UserGroupService;
import me.nithans.scm.dal.domain.scm.UserGroup;
import me.nithans.scm.dal.domain.scm.UserGroupCriteria;
import me.nithans.scm.dal.mapper.scm.UserGroupMapper;
import me.nithans.scm.dal.mapper.scm.ext.UserGroupExtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserGroupServiceImpl implements UserGroupService {

    @Autowired
    private UserGroupExtMapper userGroupExtMapper;
    @Autowired
    private UserGroupMapper userGroupMapper;

    @Override
    public void addUserGroup(Integer userId, List<Integer> groupIdList) {
        List<UserGroup> userGroupList = groupIdList.stream().map(groupId -> {
            UserGroup userGroup = new UserGroup();
            userGroup.setGroupId(groupId);
            userGroup.setUserId(userId);
            return userGroup;
        }).collect(Collectors.toList());
        userGroupExtMapper.batchInsert(userGroupList);
    }

    @Override
    public void deleteUserGroupByUserId(Integer userId) {
        UserGroupCriteria userGroupCriteria = new UserGroupCriteria();
        userGroupCriteria.createCriteria().andUserIdEqualTo(userId);
        userGroupMapper.deleteByExample(userGroupCriteria);
    }

    @Override
    public void deleteUserGroupByGroupId(Integer groupId) {
        UserGroupCriteria userGroupCriteria = new UserGroupCriteria();
        userGroupCriteria.createCriteria().andGroupIdEqualTo(groupId);
        userGroupMapper.deleteByExample(userGroupCriteria);
    }

    @Override
    public List<UserGroup> findUserGroupByUserId(Integer userId) {
        UserGroupCriteria criteria = new UserGroupCriteria();
        criteria.createCriteria().andUserIdEqualTo(userId);
        return userGroupMapper.selectByExample(criteria);
    }
}
