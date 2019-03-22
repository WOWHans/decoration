package me.nithans.decoration.biz.service;

import me.nithans.decoration.common.pojo.query.ResourceQuery;
import me.nithans.decoration.dal.domain.decoration.Resource;

import java.util.List;
import java.util.Set;

public interface ResourceService {

    Set<String> findResouceByUserId(Integer userId);
    List<Resource> findResourceByQuery(ResourceQuery resourceQuery);
}
