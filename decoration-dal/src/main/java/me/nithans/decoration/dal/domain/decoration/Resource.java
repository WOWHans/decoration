package me.nithans.decoration.dal.domain.decoration;

import java.io.Serializable;
import java.util.Date;

public class Resource implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_resource.id
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_resource.name
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_resource.type
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_resource.code
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    private Integer code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_resource.url
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_resource.parentId
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    private Integer parentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_resource.create_time
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_resource.update_time
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table decoration_resource
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_resource.id
     *
     * @return the value of decoration_resource.id
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_resource.id
     *
     * @param id the value for decoration_resource.id
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_resource.name
     *
     * @return the value of decoration_resource.name
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_resource.name
     *
     * @param name the value for decoration_resource.name
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_resource.type
     *
     * @return the value of decoration_resource.type
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_resource.type
     *
     * @param type the value for decoration_resource.type
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_resource.code
     *
     * @return the value of decoration_resource.code
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public Integer getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_resource.code
     *
     * @param code the value for decoration_resource.code
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_resource.url
     *
     * @return the value of decoration_resource.url
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_resource.url
     *
     * @param url the value for decoration_resource.url
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_resource.parentId
     *
     * @return the value of decoration_resource.parentId
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_resource.parentId
     *
     * @param parentid the value for decoration_resource.parentId
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_resource.create_time
     *
     * @return the value of decoration_resource.create_time
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_resource.create_time
     *
     * @param createTime the value for decoration_resource.create_time
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_resource.update_time
     *
     * @return the value of decoration_resource.update_time
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_resource.update_time
     *
     * @param updateTime the value for decoration_resource.update_time
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_resource
     *
     * @mbg.generated Sat Feb 02 22:05:24 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", code=").append(code);
        sb.append(", url=").append(url);
        sb.append(", parentid=").append(parentid);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}