package me.nithans.scm.api.controller;

import java.util.List;
import me.nithans.scm.api.bean.ResultInfo;
import me.nithans.scm.biz.bean.vo.ResourceVO;
import me.nithans.scm.biz.service.ResourceService;
import me.nithans.scm.common.exception.DecorationException;
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

    @GetMapping("/resource/menu")
    public ResultInfo detail(@RequestParam("userId") Integer userId) throws DecorationException {
        List<ResourceVO> resourceVOList = resourceService.findResourceVOByUserId(userId);
        return super.renderResult(resourceVOList);
    }
}
