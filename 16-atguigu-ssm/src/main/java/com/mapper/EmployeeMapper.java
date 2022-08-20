package com.mapper;


import com.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> getAllEmployee();

    int insertEmployee(Employee employee);

    int deleteEmployeeById(int id);

    int checkEmployeeNumber(String empName);

    Employee getEmployeeById(int empId);
}
