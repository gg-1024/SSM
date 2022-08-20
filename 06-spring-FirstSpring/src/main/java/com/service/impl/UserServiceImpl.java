package com.service.impl;

import com.dao.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userMapper")
    UserMapper userMapper;

    @Override
    public void getAllUser() {
        userMapper.getAllUser();
    }
}
