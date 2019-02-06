package me.nithans.decoration.biz.service.impl;

import me.nithans.decoration.biz.service.HomeService;
import me.nithans.decoration.dal.domain.decoration.HomeBaseInfo;
import me.nithans.decoration.dal.domain.decoration.HomeBaseInfoCriteria;
import me.nithans.decoration.dal.mapper.decoration.HomeBaseInfoMapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {
    @Autowired
    private HomeBaseInfoMapper homeBaseInfoMapper;

    @Override
    public HomeBaseInfo findHomeBaseInfoByUserId(Integer userId) {
        HomeBaseInfoCriteria baseInfoCriteria = new HomeBaseInfoCriteria();
        baseInfoCriteria.createCriteria().andUserIdEqualTo(userId);
        List<HomeBaseInfo> baseInfoList = homeBaseInfoMapper.selectByExample(baseInfoCriteria);
        return CollectionUtils.isNotEmpty(baseInfoList)? baseInfoList.get(0):null;
    }
}
