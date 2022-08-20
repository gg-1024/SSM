package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ParamController {

    @RequestMapping("/para1/{id}/{name}")
    public String para1(@PathVariable("id") int id,
                        @PathVariable("name")String username){
        System.out.println(id);
        System.out.println(username);
        return "para";
    }

    @RequestMapping("/para2")
    public String para2(String name,int id){
        System.out.println(name);
        System.out.println(id);
        return "para";
    }

    @RequestMapping("/para3")
    public String para3(String username, String password, String[] hobby, HttpServletRequest request){
        System.out.println(request.getRequestURI());
        System.out.println(request.getContextPath());
        
        System.out.println(username);
        System.out.println(password);
        System.out.println(hobby);
        return "para";
    }
}
