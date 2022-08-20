package com.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionResolver {

    @ExceptionHandler(value = {ArithmeticException.class})
    public String ExceptionResolver1(Exception ex, Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
