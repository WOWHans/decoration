package me.nithans.decoration.dal.mapper.decoration.ext;

import me.nithans.decoration.dal.domain.decoration.UserGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserGroupExtMapper {

    void batchInsert(@Param("userGroupList") List<UserGroup> userGroupList);
}
