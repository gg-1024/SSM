package com.service.impl;

import com.mapper.EmployeeMapper;
import com.pojo.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {



    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public int insertEmployee(Employee employee) {
        return employeeMapper.insertEmployee(employee);
    }

    @Override
    public int deleteEmployeeById(int id) {
        return employeeMapper.deleteEmployeeById(id);
    }

    @Override
    public int checkEmployeeNumber(String empName) {
        return employeeMapper.checkEmployeeNumber(empName);
    }

    @Override
    public Employee getEmployeeById(int empId) {
        return employeeMapper.getEmployeeById(empId);
    }
}
