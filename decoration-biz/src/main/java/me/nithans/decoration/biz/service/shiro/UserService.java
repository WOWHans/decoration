package me.nithans.decoration.biz.service.shiro;

public interface UserService {
    String encryptPassword(String password, String salt);
}
