package com.employee;

import com.mapper.EmployeeMapper;
import com.pojo.Employee;
import com.service.EmployeeService;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import java.util.*;

public class EmployeeTest {

    @Test
    public void getAllEmployee(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService = (EmployeeService) context.getBean("employeeServiceImpl");
        Employee employee = employeeService.getEmployeeById(1);
        System.out.println(employee);

    }

    @Test
    public void insertEmployee(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionTemplate bean = context.getBean(SqlSessionTemplate.class);
        EmployeeMapper mapper = bean.getMapper(EmployeeMapper.class);
        for (int i=100;i<1000;i++){
            String next = UUID.randomUUID().toString().substring(0, 5);
            mapper.insertEmployee(new Employee(i,next+i,"M",next+"@123","1"));
        }
    }
}
