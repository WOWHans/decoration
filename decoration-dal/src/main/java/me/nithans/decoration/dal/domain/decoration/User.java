package me.nithans.decoration.dal.domain.decoration;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_user.id
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_user.username
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_user.password
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_user.parent_id
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_user.email
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_user.telephone
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_user.status
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_user.create_time
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_user.update_time
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table decoration_user
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_user.id
     *
     * @return the value of decoration_user.id
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_user.id
     *
     * @param id the value for decoration_user.id
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_user.username
     *
     * @return the value of decoration_user.username
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_user.username
     *
     * @param username the value for decoration_user.username
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_user.password
     *
     * @return the value of decoration_user.password
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_user.password
     *
     * @param password the value for decoration_user.password
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_user.parent_id
     *
     * @return the value of decoration_user.parent_id
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_user.parent_id
     *
     * @param parentId the value for decoration_user.parent_id
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_user.email
     *
     * @return the value of decoration_user.email
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_user.email
     *
     * @param email the value for decoration_user.email
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_user.telephone
     *
     * @return the value of decoration_user.telephone
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_user.telephone
     *
     * @param telephone the value for decoration_user.telephone
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_user.status
     *
     * @return the value of decoration_user.status
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_user.status
     *
     * @param status the value for decoration_user.status
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_user.create_time
     *
     * @return the value of decoration_user.create_time
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_user.create_time
     *
     * @param createTime the value for decoration_user.create_time
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_user.update_time
     *
     * @return the value of decoration_user.update_time
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_user.update_time
     *
     * @param updateTime the value for decoration_user.update_time
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_user
     *
     * @mbg.generated Fri Feb 01 14:33:33 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", parentId=").append(parentId);
        sb.append(", email=").append(email);
        sb.append(", telephone=").append(telephone);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}