package me.nithans.decoration.biz.service;

import java.util.List;
import me.nithans.decoration.dal.domain.decoration.RoleResource;

public interface RoleResourceService {

    void deleteRoleResourceByResourceId(Integer resourceId);

    List<RoleResource> findRoleResourceByUserId(Integer userId);
}
