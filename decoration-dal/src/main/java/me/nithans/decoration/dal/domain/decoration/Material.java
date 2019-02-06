package me.nithans.decoration.dal.domain.decoration;

import java.io.Serializable;
import java.util.Date;

public class Material implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_material.id
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_material.user_id
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_material.type_id
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    private Integer typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_material.name
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_material.model
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    private String model;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_material.description
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_material.create_time
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_material.update_time
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table decoration_material
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_material.id
     *
     * @return the value of decoration_material.id
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_material.id
     *
     * @param id the value for decoration_material.id
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_material.user_id
     *
     * @return the value of decoration_material.user_id
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_material.user_id
     *
     * @param userId the value for decoration_material.user_id
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_material.type_id
     *
     * @return the value of decoration_material.type_id
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_material.type_id
     *
     * @param typeId the value for decoration_material.type_id
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_material.name
     *
     * @return the value of decoration_material.name
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_material.name
     *
     * @param name the value for decoration_material.name
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_material.model
     *
     * @return the value of decoration_material.model
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public String getModel() {
        return model;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_material.model
     *
     * @param model the value for decoration_material.model
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_material.description
     *
     * @return the value of decoration_material.description
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_material.description
     *
     * @param description the value for decoration_material.description
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_material.create_time
     *
     * @return the value of decoration_material.create_time
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_material.create_time
     *
     * @param createTime the value for decoration_material.create_time
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_material.update_time
     *
     * @return the value of decoration_material.update_time
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_material.update_time
     *
     * @param updateTime the value for decoration_material.update_time
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", typeId=").append(typeId);
        sb.append(", name=").append(name);
        sb.append(", model=").append(model);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}