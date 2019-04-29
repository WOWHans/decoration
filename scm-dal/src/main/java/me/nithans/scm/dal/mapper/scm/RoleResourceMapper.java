package me.nithans.scm.dal.mapper.scm;

import java.util.List;
import me.nithans.scm.dal.domain.scm.RoleResource;
import me.nithans.scm.dal.domain.scm.RoleResourceCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RoleResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resource
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    long countByExample(RoleResourceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resource
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int deleteByExample(RoleResourceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resource
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resource
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int insert(RoleResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resource
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int insertSelective(RoleResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resource
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    List<RoleResource> selectByExampleWithRowbounds(RoleResourceCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resource
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    List<RoleResource> selectByExample(RoleResourceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resource
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    RoleResource selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resource
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int updateByExampleSelective(@Param("record") RoleResource record, @Param("example") RoleResourceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resource
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int updateByExample(@Param("record") RoleResource record, @Param("example") RoleResourceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resource
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int updateByPrimaryKeySelective(RoleResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_resource
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    int updateByPrimaryKey(RoleResource record);
}