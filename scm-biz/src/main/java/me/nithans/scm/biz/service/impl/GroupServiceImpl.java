package me.nithans.scm.biz.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import me.nithans.scm.biz.bean.vo.GroupVO;
import me.nithans.scm.biz.service.GroupService;
import me.nithans.scm.biz.service.UserGroupService;
import me.nithans.scm.dal.domain.scm.Group;
import me.nithans.scm.dal.domain.scm.GroupCriteria;
import me.nithans.scm.dal.mapper.scm.GroupMapper;
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

    @Override
    public List<Group> findGroupByBatchId(List<Integer> groupIdList) {
        GroupCriteria criteria = new GroupCriteria();
        criteria.createCriteria().andIdIn(groupIdList);
        return groupMapper.selectByExample(criteria);
    }

    @Override
    public List<GroupVO> convertToGroupVO(List<Group> groupList) {
        return groupList.stream().map(this::convertToGroupVO).collect(Collectors.toList());
    }

    @Override
    public GroupVO convertToGroupVO(Group group) {
        GroupVO groupVO = new GroupVO();
        groupVO.setGroupId(group.getId());
        groupVO.setGroupName(group.getName());
        groupVO.setDescription(group.getDescription());
        return groupVO;
    }
}
