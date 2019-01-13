package me.nithans.decoration.biz.service.shiro.impl;

import me.nithans.decoration.biz.service.shiro.UserService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String encryptPassword(String password, String salt) {
        return new SimpleHash("md5",password, ByteSource.Util.bytes(salt),2).toHex();
    }
}
