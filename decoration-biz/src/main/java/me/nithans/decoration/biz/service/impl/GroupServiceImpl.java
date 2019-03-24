package me.nithans.decoration.biz.service.impl;

import me.nithans.decoration.biz.service.GroupService;
import me.nithans.decoration.biz.service.UserGroupService;
import me.nithans.decoration.dal.domain.decoration.Group;
import me.nithans.decoration.dal.mapper.decoration.GroupMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private UserGroupService userGroupService;

    @Autowired
    private GroupMapper groupMapper;

    @Override
    public void addGroup(String name, String description) {
        Group group = new Group();
        group.setName(name);
        group.setDescription(description);
        groupMapper.insertSelective(group);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void deleteGroup(Integer groupId) {
        groupMapper.deleteByPrimaryKey(groupId);
        userGroupService.deleteUserGroupByGroupId(groupId);
    }
}
