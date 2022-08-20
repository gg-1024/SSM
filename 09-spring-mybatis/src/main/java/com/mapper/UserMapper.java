package com.mapper;

import com.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllUser();

    void deleteUserById(int id);
}
