package me.nithans.decoration.api.controller;

import me.nithans.decoration.api.bean.ResultInfo;
import me.nithans.decoration.biz.bean.dto.UserDTO;
import me.nithans.decoration.biz.bean.vo.RegisterUserVO;
import me.nithans.decoration.biz.service.UserService;
import me.nithans.decoration.common.enums.ResponseCode;
import me.nithans.decoration.common.pojo.vo.LoginInfoVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class LoginController extends AbstractController {

    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResultInfo login(@Validated @RequestBody LoginInfoVO loginInfo) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(loginInfo.getUsername(),
            userService.encryptPassword(loginInfo.getPassword()));
        try {
            subject.login(token);
            UserDTO userDTO = (UserDTO) subject.getPrincipal();
            userDTO.setCookie(subject.getSession().getId().toString());
            return super.renderResult(userDTO);
        } catch (IncorrectCredentialsException e) {
            return super.renderError(ResponseCode.USER_PASSWORD_ERROR.getCode(),
                ResponseCode.USER_PASSWORD_ERROR.getMsg());
        } catch (UnknownAccountException e) {
            return super.renderError(ResponseCode.USER_ACCOUNT_NOTEXIST.getCode(),
                ResponseCode.USER_ACCOUNT_NOTEXIST.getMsg());
        } catch (DisabledAccountException e) {
            return super.renderError(ResponseCode.USER_ACCOUNT_DISABLED.getCode(),
                ResponseCode.USER_ACCOUNT_DISABLED.getMsg());
        } catch (Exception e) {
            log.error("登录失败 info:[username:{},password:{}]", loginInfo.getUsername(),
                loginInfo.getPassword(), e);
            return super.renderError(ResponseCode.NOKNOWN_ERROR.getCode(), e.getMessage());
        }
    }

    @GetMapping("/logout")
    public ResultInfo logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return super.renderSuccess();
    }

    @RequestMapping(value = "/register")
    public ResultInfo register(@Validated @RequestBody RegisterUserVO registerUserVO)
        throws Exception {
        userService.create(registerUserVO);
        return super.renderSuccess();
    }

    @RequestMapping(value = "/access/denied")
    public ResultInfo connectRefused() {
        return super.renderError(ResponseCode.USER_NOT_LOGIN.getCode(),
            ResponseCode.USER_NOT_LOGIN.getMsg());
    }


}
