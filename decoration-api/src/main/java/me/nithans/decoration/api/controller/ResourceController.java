package me.nithans.decoration.api.controller;

import java.util.List;
import me.nithans.decoration.api.bean.ResultInfo;
import me.nithans.decoration.biz.bean.vo.ResourceVO;
import me.nithans.decoration.biz.service.ResourceService;
import me.nithans.decoration.common.exception.DecorationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController extends AbstractController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping("/resources")
    public ResultInfo findResourceByRole(@RequestParam("roleId") Integer roleId) {
        return super.renderResult(resourceService.findResourceByRoleId(roleId));
    }

    @GetMapping("/resources")
    public ResultInfo detail(@RequestParam("userId") Integer userId) throws DecorationException {
        List<ResourceVO> resourceVOList = resourceService.findResourceVOByUserId(userId);
        return super.renderResult(resourceVOList);
    }
}
