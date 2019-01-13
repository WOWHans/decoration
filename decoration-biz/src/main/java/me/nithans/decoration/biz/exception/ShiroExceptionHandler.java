package me.nithans.decoration.biz.exception;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.alibaba.fastjson.support.spring.annotation.FastJsonView;
import com.google.common.collect.Maps;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class ShiroExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
        FastJsonJsonView jsonView = new FastJsonJsonView();
        Map<String,Object> attributesMap = Maps.newHashMap();
        if (e instanceof UnauthenticatedException) {
            attributesMap.put("error_code","10001");
            attributesMap.put("error","用户未登录");
        } else if(e instanceof UnauthorizedException) {
            attributesMap.put("error_code","10002");
            attributesMap.put("error","用户未授权");
        } else {
            attributesMap.put("error_code","10003");
            attributesMap.put("error",e.getMessage());
        }
        jsonView.setAttributesMap(attributesMap);
        mv.setView(jsonView);
        return mv;
    }
}
