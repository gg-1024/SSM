package com.mapper;

import com.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DepartmentMapper {
    //查询所有的部门
    List<Department> getAllDepartment();

    //插入一个部门，字段可以为空
    int insertDepartment(Department department);

    //插入一个部门，所有字段不允许为空
    int insertDepartmentWithAllColumn(Department department);

    //根据id修改部门名称
    int updateDepartmentById(Department department);

    //根据id删除一个部门
    int deleteDepartmentById(int departmentId);
}