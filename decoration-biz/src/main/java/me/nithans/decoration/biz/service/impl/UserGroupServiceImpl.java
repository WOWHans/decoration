package me.nithans.decoration.biz.service.impl;

import me.nithans.decoration.biz.service.UserGroupService;
import me.nithans.decoration.dal.mapper.decoration.UserGroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGroupServiceImpl implements UserGroupService {

    @Autowired
    private UserGroupMapper userGroupMapper;

    @Override
    public void addUserGroup(Integer userId, List<Integer> groupIdList) {

    }
}
