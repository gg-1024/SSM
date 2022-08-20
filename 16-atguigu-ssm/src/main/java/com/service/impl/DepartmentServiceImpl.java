package com.service.impl;

import com.mapper.DepartmentMapper;
import com.pojo.Department;
import com.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    public List<Department> getAllDepartment() {
        return departmentMapper.getAllDepartment();
    }

    @Override
    public int insertDepartment(Department department) {
        if (department.getDeptName() == null ||department.getDeptName() == "") {
            System.out.println("部门名不能为空");
            return 0;
        }
        return  departmentMapper.insertDepartment(department);
    }

    @Override
    public int insertDepartmentWithAllColumn(Department department) {
        if (department.getDeptName() == "" || department.getDeptName() ==null
            || department.getDeptID() == null){
            System.out.println("部门信心必须完整");
            return 0;
        }
        return departmentMapper.insertDepartmentWithAllColumn(department);
    }

    @Override
    public int updateDepartmentById(Department department) {
        if (department.getDeptName() == "" || department.getDeptName() ==null
                || department.getDeptID() == null){
            System.out.println("部门信心必须完整");
            return 0;
        }
        return departmentMapper.updateDepartmentById(department);
    }

    @Override
    public int deleteDepartmentById(int departmentId) {
        return departmentMapper.deleteDepartmentById(departmentId);
    }
}
