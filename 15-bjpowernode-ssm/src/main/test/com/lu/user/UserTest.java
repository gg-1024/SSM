package com.lu.user;

import com.pojo.User;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void getAllUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl");
//        List<User> userList = userService.getAllUser();
//        userList.forEach(user -> System.out.println(user));
        userService.addUser(new User(1000,"张三","1234567"));
    }
}
