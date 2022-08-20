package com.controller;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping(value = "userList",method = RequestMethod.GET)
    public String userList(HttpServletRequest request){
        List<User> userList = new ArrayList<>();
        userList.add(new User(11,"tom1",new Date()));
        userList.add(new User(12,"tom2",new Date(2020,03,11)));
        userList.add(new User(13,"tom3",new Date(2022,04,13)));
        request.setAttribute("userList",userList);
        return "main";
    }
}
