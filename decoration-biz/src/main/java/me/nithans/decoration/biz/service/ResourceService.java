package me.nithans.decoration.biz.service;

import me.nithans.decoration.biz.bean.vo.ResourceVO;
import me.nithans.decoration.common.pojo.query.ResourceQuery;
import me.nithans.decoration.dal.domain.decoration.Resource;

import java.util.List;
import java.util.Set;

public interface ResourceService {

    void addResource(ResourceVO resourceVO);
    void deleteResource(Integer resourceId);

    /**
     * 通过角色查询权限
     * @param roleId
     * @return
     */
    List<ResourceVO> findResourceByRoleId(Integer roleId);

    Set<String> findResourceByUserId(Integer userId);
    List<Resource> findResourceByUrl(String url);

    List<Resource> findResourceById(Integer id);
}
