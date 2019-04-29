package me.nithans.scm.biz.service;

import java.util.List;
import me.nithans.scm.biz.bean.vo.GroupVO;
import me.nithans.scm.dal.domain.scm.Group;

public interface GroupService {

    void addGroup(String name, String description);

    void deleteGroup(Integer groupId);

    List<Group> findGroupByBatchId(List<Integer> groupIdList);

    List<GroupVO> convertToGroupVO(List<Group> groupList);

    GroupVO convertToGroupVO(Group group);
}
