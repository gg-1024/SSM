package com.service;

import com.pojo.Department;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartment();

    int insertDepartment(Department department);

    int insertDepartmentWithAllColumn(Department department);

    int updateDepartmentById(Department department);

    int deleteDepartmentById(int departmentId);
}
