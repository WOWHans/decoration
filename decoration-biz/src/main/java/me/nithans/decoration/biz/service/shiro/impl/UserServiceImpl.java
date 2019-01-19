package me.nithans.decoration.biz.service.shiro.impl;

import me.nithans.decoration.biz.service.shiro.UserService;
import me.nithans.decoration.dal.mapper.decoration.UserMapper;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public String encryptPassword(String password, String salt) {
        return new SimpleHash("md5",password, ByteSource.Util.bytes(salt),2).toHex();
    }
}
