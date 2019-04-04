package me.nithans.decoration.biz.service.impl;

import me.nithans.decoration.biz.service.UserGroupService;
import me.nithans.decoration.dal.domain.decoration.UserGroup;
import me.nithans.decoration.dal.domain.decoration.UserGroupCriteria;
import me.nithans.decoration.dal.mapper.decoration.UserGroupMapper;
import me.nithans.decoration.dal.mapper.decoration.ext.UserGroupExtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
