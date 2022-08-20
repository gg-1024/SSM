package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("eee")
    public String error(){
        System.out.println(1/0);
        return "hello";
    }
}
