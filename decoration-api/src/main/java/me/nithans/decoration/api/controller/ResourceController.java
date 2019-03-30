package me.nithans.decoration.api.controller;

import me.nithans.decoration.api.bean.ResultInfo;
import me.nithans.decoration.biz.service.ResourceService;
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
}
