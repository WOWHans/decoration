package me.nithans.scm.biz.service;

import me.nithans.scm.biz.bean.vo.RegisterDetailUserVO;
import me.nithans.scm.biz.bean.vo.RegisterUserVO;
import me.nithans.scm.common.exception.DecorationException;
import me.nithans.scm.dal.domain.scm.User;

public interface UserService {

    String encryptPassword(String password);

    boolean create(RegisterUserVO userVO) throws Exception;

    boolean update(RegisterUserVO userVO);

    boolean modifyPassword(Integer userId, String oldPassword, String newPassword) throws Exception;

    User findUserByUsername(String username);

    RegisterDetailUserVO findUserDetailById(Integer userId) throws DecorationException;

    User findUserById(Integer userId);
}
