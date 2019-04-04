package me.nithans.decoration.biz.service.impl;

import java.util.stream.Collectors;
import me.nithans.decoration.biz.bean.vo.GroupVO;
import me.nithans.decoration.biz.bean.vo.RegisterDetailUserVO;
import me.nithans.decoration.biz.bean.vo.RegisterUserVO;
import me.nithans.decoration.biz.bean.vo.RoleVO;
import me.nithans.decoration.biz.service.GroupService;
import me.nithans.decoration.biz.service.RoleService;
import me.nithans.decoration.biz.service.UserGroupService;
import me.nithans.decoration.biz.service.UserRoleService;
import me.nithans.decoration.biz.service.UserService;
import me.nithans.decoration.common.exception.DecorationException;
import me.nithans.decoration.dal.domain.decoration.Group;
import me.nithans.decoration.dal.domain.decoration.Role;
import me.nithans.decoration.dal.domain.decoration.User;
import me.nithans.decoration.dal.domain.decoration.UserCriteria;
import me.nithans.decoration.dal.domain.decoration.UserGroup;
import me.nithans.decoration.dal.domain.decoration.UserRole;
import me.nithans.decoration.dal.mapper.decoration.UserMapper;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import sun.jvm.hotspot.debugger.DebuggerException;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    private static final String salt = "decoration";

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserGroupService userGroupService;
    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private GroupService groupService;

    @Override
    public String encryptPassword(String password) {
        return new SimpleHash("md5", password, ByteSource.Util.bytes(salt), 2).toHex();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public boolean create(RegisterUserVO userVO) throws Exception {
        UserCriteria userCriteria = new UserCriteria();
        userCriteria.createCriteria().andUsernameEqualTo(userVO.getUsername());
        long count = userMapper.countByExample(userCriteria);
        if (count > 0) {
            LOGGER.warn("create user: username {} is repeated", userVO.getUsername());
            throw new Exception("用户名已存在");
        }
        User user = new User();
        if (StringUtils.isEmpty(userVO.getPassword())) {
            userVO.setPassword("123456");
        }
        BeanUtils.copyProperties(userVO, user);
        user.setPassword(encryptPassword(user.getPassword()));
        // 新增用户
        Integer userId = userMapper.insertSelective(user);
        // 添加组
        if (!CollectionUtils.isEmpty(userVO.getGroups())) {
            userGroupService.addUserGroup(userId, userVO.getGroups());
        }
        // 添加角色
        if (!CollectionUtils.isEmpty(userVO.getRoles())) {
            userRoleService.addUserRole(userId, userVO.getRoles());
        }
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public boolean update(RegisterUserVO userVO) {
        User user = new User();
        BeanUtils.copyProperties(userVO, user);
        user.setPassword(null);
        userMapper.updateByPrimaryKeySelective(user);

        userGroupService.deleteUserGroupByUserId(user.getId());
        if (!CollectionUtils.isEmpty(userVO.getGroups())) {
            userGroupService.addUserGroup(user.getId(), userVO.getGroups());
        }
        userRoleService.deleteUserRoleByUserId(user.getId());
        if (!CollectionUtils.isEmpty(userVO.getRoles())) {
            userRoleService.addUserRole(user.getId(), userVO.getRoles());
        }
        return true;
    }

    @Override
    public boolean modifyPassword(Integer userId, String oldPassword, String newPassword)
        throws Exception {
        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            throw new Exception("用户不存在");
        }
        boolean isSameAsOld = user.getPassword().equals(encryptPassword(oldPassword));
        if (isSameAsOld != true) {
            throw new Exception("原密码不正确");
        }
        user.setPassword(encryptPassword(newPassword));
        userMapper.updateByPrimaryKeySelective(user);
        return true;
    }

    @Override
    public User findUserByUsername(String username) {
        UserCriteria userCriteria = new UserCriteria();
        userCriteria.createCriteria().andUsernameEqualTo(username);
        List<User> userList = userMapper.selectByExample(userCriteria);
        return CollectionUtils.isEmpty(userList) ? null : userList.get(0);
    }

    @Override
    public User findUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public RegisterDetailUserVO findUserDetailById(Integer userId) throws DecorationException {
        RegisterDetailUserVO registerDetailUserVO = new RegisterDetailUserVO();

        User user = findUserById(userId);
        if (user == null) {
            throw new DecorationException("该用户不存在");
        }
        List<UserRole> userRoleList = userRoleService.findRoleByUserId(userId);
        if (CollectionUtils.isEmpty(userRoleList)) {
            throw new DecorationException("未分配用户角色");
        }
        List<Integer> roleIdList = userRoleList.stream().map(UserRole::getId)
            .collect(Collectors.toList());
        List<Role> roleList = roleService.findRoleByBatchId(roleIdList);
        List<RoleVO> roleVOList = roleService.convertToRoleVO(roleList);
        // todo
        List<UserGroup> userGroupList = userGroupService.findUserGroupByUserId(userId);
        List<Integer> groupIdList = userGroupList.stream().map(UserGroup::getGroupId).collect(
            Collectors.toList());
        List<Group> groupList = groupService.findGroupByBatchId(groupIdList);
        List<GroupVO> groupVOList = groupService.convertToGroupVO(groupList);

        registerDetailUserVO.setRoles(roleVOList);
        registerDetailUserVO.setGroups(groupVOList);
        registerDetailUserVO.setUserId(userId);
        registerDetailUserVO.setEmail(user.getEmail());
        registerDetailUserVO.setTelephone(user.getTelephone());
        registerDetailUserVO.setStatus(user.getStatus());

        return registerDetailUserVO;
    }
}
