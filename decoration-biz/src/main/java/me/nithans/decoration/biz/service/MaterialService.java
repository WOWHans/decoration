package me.nithans.decoration.biz.service;

import me.nithans.decoration.dal.domain.decoration.Material;

import java.util.List;

public interface MaterialService {
    boolean saveMaterial(Material material);
    List<Material> findMaterialByUserId(Integer userId);
}
