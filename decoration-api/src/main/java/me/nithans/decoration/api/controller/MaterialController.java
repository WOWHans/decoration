package me.nithans.decoration.api.controller;

import static me.nithans.decoration.common.enums.ResponseCode.MATERIAL_CREATE_ERROR;

import java.util.List;
import me.nithans.decoration.api.bean.ResultInfo;
import me.nithans.decoration.biz.service.MaterialService;
import me.nithans.decoration.dal.domain.decoration.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaterialController extends AbstractController {

    @Autowired
    private MaterialService materialService;

    @PostMapping("/material")
    public ResultInfo<?> saveMaterialInfo(@RequestBody Material material) {
        boolean result = materialService.saveMaterial(material);
        if (result != true) {
            return super
                .renderError(MATERIAL_CREATE_ERROR.getCode(), MATERIAL_CREATE_ERROR.getMsg());
        }
        return super.renderSuccess();
    }

    @GetMapping("/material")
    public ResultInfo<?> getMaterials(@RequestParam("userId") Integer userId) {
        List<Material> materialList = materialService.findMaterialByUserId(userId);
        return super.renderResult(materialList);
    }
}
