package com;

import com.pojo.User;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {

    @Test
    public void getAllUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl");
        List<User> userList = userService.getAllUser();
        userList.forEach(user -> System.out.println(user));
    }
}
