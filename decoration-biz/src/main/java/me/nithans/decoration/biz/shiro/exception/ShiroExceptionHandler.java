package me.nithans.decoration.biz.shiro.exception;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import me.nithans.decoration.common.enums.ResponseCode;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class ShiroExceptionHandler implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
        HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
        FastJsonJsonView jsonView = new FastJsonJsonView();
        Map<String, Object> attributesMap = Maps.newHashMap();
        attributesMap.put("status", false);
        if (e instanceof UnauthenticatedException) {
            attributesMap.put("code", ResponseCode.USER_NOT_LOGIN.getCode());
            attributesMap.put("msg", ResponseCode.USER_NOT_LOGIN.getMsg());
        } else if (e instanceof UnauthorizedException) {
            attributesMap.put("code", ResponseCode.USER_NO_AUTHORITY.getCode());
            attributesMap.put("msg", ResponseCode.USER_NO_AUTHORITY.getMsg());
        } else {
            attributesMap.put("code", ResponseCode.NOKNOWN_ERROR.getCode());
            attributesMap.put("msg", e.getMessage());
        }
        jsonView.setAttributesMap(attributesMap);
        mv.setView(jsonView);
        return mv;
    }
}
