package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/?t1")
    public String t1(){
        System.out.println("test的t1");
        return "test";
    }

    @RequestMapping("/*t1")
    public String t2(){
        System.out.println("test的t2");
        return "test";
    }

    @RequestMapping("/**/t1")
    public String t3(){
        System.out.println("test的t3");
        return "test";
    }
}
