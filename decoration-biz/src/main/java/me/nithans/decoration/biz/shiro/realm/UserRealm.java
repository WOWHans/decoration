package me.nithans.decoration.biz.shiro.realm;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import me.nithans.decoration.biz.bean.dto.UserDTO;
import me.nithans.decoration.biz.bean.vo.ResourceVO;
import me.nithans.decoration.biz.service.ResourceService;
import me.nithans.decoration.biz.service.RoleService;
import me.nithans.decoration.biz.service.UserRoleService;
import me.nithans.decoration.biz.service.UserService;
import me.nithans.decoration.common.enums.UserStatusEnum;
import me.nithans.decoration.common.exception.DecorationException;
import me.nithans.decoration.dal.domain.decoration.Role;
import me.nithans.decoration.dal.domain.decoration.User;
import me.nithans.decoration.dal.domain.decoration.UserRole;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRealm.class);
    @Autowired
    private UserService userService;
    @Autowired
    private ResourceService resourceService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private UserRoleService userRoleService;

    /**
     * 授权 将有权限的resource id 集合放入授权信息内，用于后面检验是否可访问
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        UserDTO userDTO = (UserDTO) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        Set<String> resourceSet = resourceService.findResourceByUserId(userDTO.getUserId());
        authorizationInfo.setStringPermissions(resourceSet);
        return authorizationInfo;
    }

    /**
     * 登录
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
        throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        User user = userService.findUserByUsername(username);
        if (null == user) {
            throw new UnknownAccountException("账号不存在");
        }
        if (user.getStatus().intValue() == UserStatusEnum.DISABLED.getCode()) {
            throw new DisabledAccountException("账号已被禁用");
        }
        List<ResourceVO> menuTree = Lists.newArrayList();
        try {
            menuTree = resourceService.findResourceVOByUserId(user.getId());
        } catch (DecorationException e) {
            LOGGER.error(e.getMessage(), e);
        }
        List<UserRole> userRoles = userRoleService.findRoleByUserId(user.getId());
        List<Role> roleList = roleService
            .findRoleByBatchId(userRoles.stream().map(UserRole::getRoleId).collect(
                Collectors.toList()));

        UserDTO userDTO = convertToUserDTO(user);
        userDTO.setMenuTree(menuTree);
        userDTO.setRoles(roleList);

        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
            userDTO, user.getPassword(), getName());
        return simpleAuthenticationInfo;
    }

    private UserDTO convertToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setTelephone(user.getTelephone());
        userDTO.setStatus(user.getStatus());
        return userDTO;
    }
}
