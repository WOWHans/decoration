package me.nithans.decoration.api.controller;

import me.nithans.decoration.api.bean.ResultInfo;
import me.nithans.decoration.biz.service.HomeService;
import me.nithans.decoration.dal.domain.decoration.HomeBaseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeInfoController extends AbstractController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/info")
    public ResultInfo<?> homeInfo(@RequestParam("userId") Integer userId) {
        HomeBaseInfo homeBaseInfo = homeService.findHomeBaseInfoByUserId(userId);
        return super.renderResult(homeBaseInfo);
    }
}
