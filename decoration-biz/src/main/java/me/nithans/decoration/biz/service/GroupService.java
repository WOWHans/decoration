package me.nithans.decoration.biz.service;

import java.util.List;
import me.nithans.decoration.biz.bean.vo.GroupVO;
import me.nithans.decoration.dal.domain.decoration.Group;

public interface GroupService {

    void addGroup(String name, String description);

    void deleteGroup(Integer groupId);

    List<Group> findGroupByBatchId(List<Integer> groupIdList);

    List<GroupVO> convertToGroupVO(List<Group> groupList);

    GroupVO convertToGroupVO(Group group);
}
