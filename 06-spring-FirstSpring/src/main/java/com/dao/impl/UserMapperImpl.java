package com.dao.impl;

import com.dao.UserMapper;
import org.springframework.stereotype.Repository;

@Repository("userMapper")
public class UserMapperImpl implements UserMapper {
    @Override
    public void getAllUser() {
        System.out.println("获取到了全部的数据");
    }
}
