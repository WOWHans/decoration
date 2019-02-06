package me.nithans.decoration.biz.service;

import me.nithans.decoration.dal.domain.decoration.HomeBaseInfo;

public interface HomeService {

    HomeBaseInfo findHomeBaseInfoByUserId(Integer userId);
}
