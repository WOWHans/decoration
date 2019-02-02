package me.nithans.decoration.dal.mapper.decoration;

import java.util.List;
import me.nithans.decoration.dal.domain.decoration.UserRole;
import me.nithans.decoration.dal.domain.decoration.UserRoleCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_user_role
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    long countByExample(UserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_user_role
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    int deleteByExample(UserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_user_role
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_user_role
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_user_role
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    int insertSelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_user_role
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    List<UserRole> selectByExampleWithRowbounds(UserRoleCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_user_role
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    List<UserRole> selectByExample(UserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_user_role
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    UserRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_user_role
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_user_role
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_user_role
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_user_role
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    int updateByPrimaryKey(UserRole record);
}