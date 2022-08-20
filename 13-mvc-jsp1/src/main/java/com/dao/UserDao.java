package com.dao;

import com.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao {
    private static int count = 1006;

    private static Map<Integer, User> map;
    static {
        map = new HashMap<>();
        map.put(1,new User(1,"a","a"));
        map.put(2,new User(2,"b","b"));
        map.put(3,new User(3,"c","c"));
        map.put(4,new User(4,"d","d"));
        map.put(5,new User(5,"e","e"));
        map.put(6,new User(6,"f","f"));
        map.put(7,new User(7,"g","g"));
    }

    public Collection<User> getAllUser(){
        return map.values();
    }

    public User getUserById(Integer id){
        return map.get(id);
    }

    public void addUser(User user){
        if (user.getId() == null){
            user.setId(count++);
        }
        map.put(user.getId(),user);
    }

    public void deleteUserById(int id){
        map.remove(id);
    }
}
