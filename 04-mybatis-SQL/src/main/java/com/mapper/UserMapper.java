package com.mapper;

import com.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getAllUser();

    int addUser(User user);

    List<User> getByLike(User user);

    int updateUser(User user);

    List<User> getBySomeId(Integer[] array);

    void addUsers(List<User> userList);

    List<User> getByMap(Map map);

    Map getUserReturnMapById(Integer id);
}
