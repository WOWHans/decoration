package me.nithans.decoration.biz.shiro.realm;

import me.nithans.decoration.biz.service.ResourceService;
import me.nithans.decoration.biz.service.UserService;
import me.nithans.decoration.common.enums.UserStatusEnum;
import me.nithans.decoration.dal.domain.decoration.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    @Autowired
    private ResourceService resourceService;

    /**
     * 授权 将有权限的resource id 集合放入授权信息内，用于后面检验是否可访问
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

        User user = userService.findUserByUsername(username);
        Set<String> resourceSet = resourceService.findResourceByUserId(user.getId());
        authorizationInfo.setStringPermissions(resourceSet);
        return authorizationInfo;
    }

    /**
     * 登录
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        User user = userService.findUserByUsername(username);
        if (null == user) {
            throw new UnknownAccountException("账号不存在");
        }
        if (user.getStatus().intValue() == UserStatusEnum.DISABLED.getCode()) {
            throw new DisabledAccountException("账号已被禁用");
        }
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(),getName());
        return simpleAuthenticationInfo;
    }
}
