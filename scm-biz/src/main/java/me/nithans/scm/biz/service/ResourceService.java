package me.nithans.scm.biz.service;

import java.util.List;
import java.util.Set;
import me.nithans.scm.biz.bean.vo.ResourceVO;
import me.nithans.scm.common.exception.DecorationException;
import me.nithans.scm.dal.domain.scm.Resource;

public interface ResourceService {

    void addResource(ResourceVO resourceVO);

    void deleteResource(Integer resourceId);

    /**
     * 通过角色查询权限
     */
    List<ResourceVO> findResourceByRoleId(Integer roleId);

    List<ResourceVO> findResourceVOByUserId(Integer userId) throws DecorationException;

    Set<String> findResourceByUserId(Integer userId);

    List<Resource> findResourceByUrl(String url);

    List<Resource> findResourceById(Integer id);
}
