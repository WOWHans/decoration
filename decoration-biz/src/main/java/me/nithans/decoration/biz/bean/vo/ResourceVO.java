package me.nithans.decoration.biz.bean.vo;

import com.google.common.collect.Lists;

import java.util.List;

public class ResourceVO {
    private Integer resourceId;

    private String name;

    private String code;

    private String url;

    private String parentId;

    private List<ResourceVO> resourceVOList = Lists.newArrayList();

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<ResourceVO> getResourceVOList() {
        return resourceVOList;
    }

    public void setResourceVOList(List<ResourceVO> resourceVOList) {
        this.resourceVOList = resourceVOList;
    }
}
