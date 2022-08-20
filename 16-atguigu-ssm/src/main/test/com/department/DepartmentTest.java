package com.department;

import com.mapper.DepartmentMapper;
import com.pojo.Department;
import com.service.DepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;
import java.util.List;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class DepartmentTest {
//    @Autowired
//    DepartmentMapper departmentMapper;

    @Test
    public void getAllDepartment(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DepartmentService departmentService = (DepartmentService) context.getBean("departmentServiceImpl");
        departmentService.deleteDepartmentById(1);
    }
}
