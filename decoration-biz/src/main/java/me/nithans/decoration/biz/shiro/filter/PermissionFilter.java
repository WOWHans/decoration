package me.nithans.decoration.biz.shiro.filter;

import me.nithans.decoration.biz.service.ResourceService;
import me.nithans.decoration.common.pojo.query.ResourceQuery;
import me.nithans.decoration.dal.domain.decoration.Resource;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

public class PermissionFilter extends AccessControlFilter {

    @Autowired
    private ResourceService resourceService;

    /**
     * 校验授权资源
     * @param servletRequest
     * @param servletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String url = request.getServletPath();
        ResourceQuery query = new ResourceQuery();
        query.setUrl(url);
        List<Resource> resourceList = resourceService.findResourceByQuery(query);
        List<String> resourceIdList = resourceList.stream().map(resource -> String.valueOf(resource.getId())).collect(Collectors.toList());
        Subject subject = SecurityUtils.getSubject();
        return subject.isPermittedAll(resourceIdList.toArray(new String[resourceIdList.size()]));
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        return false;
    }
}
