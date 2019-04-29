package me.nithans.scm.dal.mapper.scm;

import java.util.List;
import me.nithans.scm.dal.domain.scm.UserGroup;
import me.nithans.scm.dal.domain.scm.UserGroupCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    long countByExample(UserGroupCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int deleteByExample(UserGroupCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int insert(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int insertSelective(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    List<UserGroup> selectByExampleWithRowbounds(UserGroupCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    List<UserGroup> selectByExample(UserGroupCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    UserGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserGroup record, @Param("example") UserGroupCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int updateByExample(@Param("record") UserGroup record, @Param("example") UserGroupCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int updateByPrimaryKeySelective(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_group
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int updateByPrimaryKey(UserGroup record);
}