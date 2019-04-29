package me.nithans.scm.dal.domain.scm;

import java.io.Serializable;
import java.util.Date;

public class UserRole implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.id
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.user_id
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.role_id
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.create_time
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.update_time
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user_role
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.id
     *
     * @return the value of sys_user_role.id
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.id
     *
     * @param id the value for sys_user_role.id
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.user_id
     *
     * @return the value of sys_user_role.user_id
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.user_id
     *
     * @param userId the value for sys_user_role.user_id
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.role_id
     *
     * @return the value of sys_user_role.role_id
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.role_id
     *
     * @param roleId the value for sys_user_role.role_id
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.create_time
     *
     * @return the value of sys_user_role.create_time
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.create_time
     *
     * @param createTime the value for sys_user_role.create_time
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.update_time
     *
     * @return the value of sys_user_role.update_time
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.update_time
     *
     * @param updateTime the value for sys_user_role.update_time
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Mon Apr 29 17:22:25 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}