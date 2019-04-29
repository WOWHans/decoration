package me.nithans.scm.biz.service;

import java.util.List;
import me.nithans.scm.dal.domain.scm.RoleResource;

public interface RoleResourceService {

    void deleteRoleResourceByResourceId(Integer resourceId);

    List<RoleResource> findRoleResourceByUserId(Integer userId);
}
