package me.nithans.decoration.biz.shiro.filter;

import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import me.nithans.decoration.biz.service.ResourceService;
import me.nithans.decoration.dal.domain.decoration.Resource;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

public class PermissionFilter extends AccessControlFilter {

    @Autowired
    private ResourceService resourceService;

    /**
     * 校验授权资源
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest,
        ServletResponse servletResponse, Object o) throws Exception {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String url = request.getServletPath();
        List<Resource> resourceList = resourceService.findResourceByUrl(url);
        if (CollectionUtils.isEmpty(resourceList)) {
            return true;
        }
        List<String> resourceIdList = resourceList.stream()
            .map(resource -> String.valueOf(resource.getId())).collect(Collectors.toList());
        Subject subject = SecurityUtils.getSubject();
        return subject.isPermittedAll(resourceIdList.toArray(new String[resourceIdList.size()]));
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse)
        throws Exception {
        return false;
    }
}
