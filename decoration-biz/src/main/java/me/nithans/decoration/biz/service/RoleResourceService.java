package me.nithans.decoration.biz.service;

import me.nithans.decoration.dal.domain.decoration.RoleResource;

import java.util.List;

public interface RoleResourceService {

    void deleteRoleResourceByResourceId(Integer resourceId);

    List<RoleResource> findRoleResourceByUserId(Integer userId);
}
