package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping("/rest")
    public String rest(){
        return "rest";
    }

    //获取所有数据
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser(){
        System.out.println("其获取到所有书籍");
        return "rest";
    }

    //根据id获取数据
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(@PathVariable("id") String id){
        System.out.println(id);
        System.out.println("获取到了数据");
        return "rest";
    }

    //添加数据
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String insert(int id,String username){
        System.out.println(id);
        System.out.println(username);
        System.out.println("数据添加成功");
        return "rest";
    }

    //删除数据
    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String delete(int id){
        System.out.println(id);
        System.out.println("数据删除成功");
        return "redirect:/rest";
    }

    //修改数据
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String put(int id,String username){
        System.out.println(id);
        System.out.println(username);
        System.out.println("数据修改成功");
        return "redirect:/rest";
    }


}
