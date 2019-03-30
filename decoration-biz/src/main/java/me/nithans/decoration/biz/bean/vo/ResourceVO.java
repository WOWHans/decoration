package me.nithans.decoration.biz.bean.vo;

import com.google.common.collect.Lists;

import java.util.List;

public class ResourceVO {
    private Integer resourceId;

    private String name;

    private Integer code;

    private String url;

    private Integer parentId;

    private List<ResourceVO> childResourceList = Lists.newArrayList();

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

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<ResourceVO> getChildResourceList() {
        return childResourceList;
    }

    public void setChildResourceList(List<ResourceVO> childResourceList) {
        this.childResourceList = childResourceList;
    }
}
