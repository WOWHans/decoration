package me.nithans.decoration.biz.service.impl;

import me.nithans.decoration.biz.service.MaterialService;
import me.nithans.decoration.dal.domain.decoration.Material;
import me.nithans.decoration.dal.domain.decoration.MaterialCriteria;
import me.nithans.decoration.dal.mapper.decoration.MaterialMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialMapper materialMapper;

    @Override
    public boolean saveMaterial(Material material) {
        long count = materialMapper.insertSelective(material);
        if (count <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public List<Material> findMaterialByUserId(Integer userId) {
        MaterialCriteria criteria = new MaterialCriteria();
        criteria.createCriteria().andUserIdEqualTo(userId);
        List<Material> materialList = materialMapper.selectByExample(criteria);
        return materialList;
    }
}
