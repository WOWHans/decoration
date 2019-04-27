package me.nithans.decoration.biz.bean.vo;

import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.List;

public class ResourceVO implements Serializable {

    private Integer resourceId;

    private String name;

    private String icon;

    private String component;

    private Integer code;

    private String url;

    private Integer parentId;

    private Byte type;

    private List<ResourceVO> children = Lists.newArrayList();

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getParentId() {
        return parentId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<ResourceVO> getChildren() {
        return children;
    }

    public void setChildren(List<ResourceVO> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "ResourceVO{" +
            "resourceId=" + resourceId +
            ", name='" + name + '\'' +
            ", icon='" + icon + '\'' +
            ", component='" + component + '\'' +
            ", code=" + code +
            ", url='" + url + '\'' +
            ", parentId=" + parentId +
            ", type=" + type +
            ", children=" + children +
            '}';
    }
}
