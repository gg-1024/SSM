package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;


@Controller
public class TestModelAndViewController {
    
    @RequestMapping("/mv1")
    public ModelAndView mv1(HttpServletRequest request){
        ServletContext application = request.getSession().getServletContext();
        application.setAttribute("application","application");
        ModelAndView mv = new ModelAndView();
        mv.addObject("username","张三");
        mv.setViewName("view");
        return mv;
    }
}
