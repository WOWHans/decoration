package me.nithans.decoration.biz.service;

import me.nithans.decoration.biz.bean.vo.RegisterUserVO;
import me.nithans.decoration.dal.domain.decoration.User;

import java.util.List;

public interface UserService {
    String encryptPassword(String password);

    boolean create(RegisterUserVO userVO) throws Exception;

    boolean update(RegisterUserVO userVO);

    boolean modifyPassword(Integer userId, String oldPassword, String newPassword) throws Exception;

    User findUserByUsername(String username);
}
