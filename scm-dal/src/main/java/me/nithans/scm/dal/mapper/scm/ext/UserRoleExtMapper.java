package me.nithans.scm.dal.mapper.scm.ext;

import java.util.List;
import me.nithans.scm.dal.domain.scm.UserRole;
import org.apache.ibatis.annotations.Param;

public interface UserRoleExtMapper {

    void batchInsert(@Param("userRoleList") List<UserRole> userRoleList);
}
