package com.service;

import com.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    int insertEmployee(Employee employee);

    int deleteEmployeeById(int id);

    int checkEmployeeNumber(String empName);

    Employee getEmployeeById(int empId);
}
