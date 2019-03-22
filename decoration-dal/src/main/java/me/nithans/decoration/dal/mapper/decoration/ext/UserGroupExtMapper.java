package me.nithans.decoration.dal.mapper.decoration.ext;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserGroupExtMapper {

    void batchInsert(@Param("userId") Integer userId, @Param("groupIdList") List<Integer> groupIdList);
}
