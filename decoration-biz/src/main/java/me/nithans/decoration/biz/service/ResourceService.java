package me.nithans.decoration.biz.service;

import java.util.Set;

public interface ResourceService {

    Set<String> findResouceByUserId(Integer userId);
}
