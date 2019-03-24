package me.nithans.decoration.dal.domain.decoration;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_role.id
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_role.name
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_role.description
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_role.create_time
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_role.update_time
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table decoration_role
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_role.id
     *
     * @return the value of decoration_role.id
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_role.id
     *
     * @param id the value for decoration_role.id
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_role.name
     *
     * @return the value of decoration_role.name
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_role.name
     *
     * @param name the value for decoration_role.name
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_role.description
     *
     * @return the value of decoration_role.description
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_role.description
     *
     * @param description the value for decoration_role.description
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_role.create_time
     *
     * @return the value of decoration_role.create_time
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_role.create_time
     *
     * @param createTime the value for decoration_role.create_time
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_role.update_time
     *
     * @return the value of decoration_role.update_time
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_role.update_time
     *
     * @param updateTime the value for decoration_role.update_time
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_role
     *
     * @mbg.generated Sun Mar 24 17:56:16 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}