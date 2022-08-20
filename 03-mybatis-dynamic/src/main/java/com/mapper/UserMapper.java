package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> getAllUser();

    int add(User user);

    List<User> getByLike(@Param("columnType") String columnType,
                         @Param("columnValue") String columnValue);
}
