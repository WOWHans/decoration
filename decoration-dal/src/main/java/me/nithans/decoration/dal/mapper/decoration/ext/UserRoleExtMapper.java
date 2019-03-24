package me.nithans.decoration.dal.mapper.decoration.ext;

import me.nithans.decoration.dal.domain.decoration.UserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRoleExtMapper {

    void batchInsert(@Param("userRoleList") List<UserRole> userRoleList);
}
