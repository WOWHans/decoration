package me.nithans.decoration.biz.service;

import me.nithans.decoration.biz.bean.vo.RegisterDetailUserVO;
import me.nithans.decoration.biz.bean.vo.RegisterUserVO;
import me.nithans.decoration.common.exception.DecorationException;
import me.nithans.decoration.dal.domain.decoration.User;

public interface UserService {

    String encryptPassword(String password);

    boolean create(RegisterUserVO userVO) throws Exception;

    boolean update(RegisterUserVO userVO);

    boolean modifyPassword(Integer userId, String oldPassword, String newPassword) throws Exception;

    User findUserByUsername(String username);

    RegisterDetailUserVO findUserDetailById(Integer userId) throws DecorationException;

    User findUserById(Integer userId);
}
