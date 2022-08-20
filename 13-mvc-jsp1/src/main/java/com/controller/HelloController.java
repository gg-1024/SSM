package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/h")
    public String helloMvc(HttpServletRequest request){
        request.setAttribute("hello","hello,mvc");
        return "hello";
    }

    @RequestMapping("/forward1")
    public String forward1(HttpServletRequest request){
        System.out.println("forward1方法执行了");
        request.setAttribute("hello","hello,mvc");
        return "forward:/index.jsp";
    }

    @RequestMapping("/forward2")
    public String forward2(HttpServletRequest request){
        request.setAttribute("hello","hello,mvc");
        return "forward:/h";
    }

    @RequestMapping("/redirect1")
    public String redirect1(HttpServletRequest request){
        request.setAttribute("hello","hello,mvc");
        return "redirect:/hello";
    }

    @RequestMapping("/redirect2")
    public String redirect2(HttpServletRequest request){
        request.setAttribute("hello","hello,mvc");
        return "redirect:/h";
    }

}
