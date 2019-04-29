package me.nithans.scm.dal.mapper.scm.ext;

import java.util.List;
import me.nithans.scm.dal.domain.scm.UserGroup;
import org.apache.ibatis.annotations.Param;

public interface UserGroupExtMapper {

    void batchInsert(@Param("userGroupList") List<UserGroup> userGroupList);
}
