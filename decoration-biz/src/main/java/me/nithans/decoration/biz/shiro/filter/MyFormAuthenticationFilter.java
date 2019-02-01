package me.nithans.decoration.biz.shiro.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

@Slf4j
public class MyFormAuthenticationFilter extends FormAuthenticationFilter {

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        // 判断是否是登录请求
        if (this.isLoginRequest(request, response)) {
            // 判断是否是POST请求
            if (this.isLoginSubmission(request, response)) {
                if (log.isTraceEnabled()) {
                    log.trace("检测到登录POST请求, 正尝试去执行登录");
                }
                return this.executeLogin(request, response);
            } else {
                redirectToLogin(request, response);
                return true;
            }
        } else {
            if (log.isTraceEnabled()) {
                log.trace("Attempting to access a path which requires authentication.  Forwarding to the Authentication url [" + this.getLoginUrl() + "]");
            }
            redirectToLogin(request, response);
            return false;
        }
    }

    @Override
    protected void redirectToLogin(ServletRequest request, ServletResponse response) throws IOException {
        try {
            log.error("用户未登录,请求:{} 被拒", WebUtils.toHttp(request).getRequestURI());
            request.getRequestDispatcher("/account/access/denied").forward(request,response);
        } catch (ServletException e) {
            log.error("Redirect To Login Request error", e);
        }

    }
}
