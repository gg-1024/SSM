package com;

import e1.Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        Service bookService = (Service) context.getBean("bookService");
        bookService.show();
        System.out.println(bookService);
    }
}
