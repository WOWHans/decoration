package me.nithans.decoration.biz.service;

import java.util.List;
import me.nithans.decoration.dal.domain.decoration.Material;

public interface MaterialService {

    boolean saveMaterial(Material material);

    List<Material> findMaterialByUserId(Integer userId);
}
