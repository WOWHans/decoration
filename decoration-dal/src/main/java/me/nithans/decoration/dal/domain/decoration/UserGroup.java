package me.nithans.decoration.dal.domain.decoration;

import java.io.Serializable;
import java.util.Date;

public class UserGroup implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_user_group.id
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_user_group.user_id
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_user_group.group_id
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_user_group.create_time
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_user_group.update_time
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table decoration_user_group
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_user_group.id
     *
     * @return the value of decoration_user_group.id
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_user_group.id
     *
     * @param id the value for decoration_user_group.id
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_user_group.user_id
     *
     * @return the value of decoration_user_group.user_id
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_user_group.user_id
     *
     * @param userId the value for decoration_user_group.user_id
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_user_group.group_id
     *
     * @return the value of decoration_user_group.group_id
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_user_group.group_id
     *
     * @param groupId the value for decoration_user_group.group_id
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_user_group.create_time
     *
     * @return the value of decoration_user_group.create_time
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_user_group.create_time
     *
     * @param createTime the value for decoration_user_group.create_time
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_user_group.update_time
     *
     * @return the value of decoration_user_group.update_time
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_user_group.update_time
     *
     * @param updateTime the value for decoration_user_group.update_time
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_user_group
     *
     * @mbg.generated Fri Mar 22 16:15:45 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", groupId=").append(groupId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}