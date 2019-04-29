package me.nithans.decoration.api.controller;

import me.nithans.decoration.api.bean.ResultInfo;
import me.nithans.decoration.biz.bean.dto.UserDTO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends AbstractController {

    @GetMapping("/detail")
    public ResultInfo findUserInfoByCookie() {
        Subject subject = SecurityUtils.getSubject();
        UserDTO userDTO = (UserDTO) subject.getPrincipal();
        userDTO.setCookie(subject.getSession().getId().toString());
        return super.renderResult(userDTO);
    }
}
