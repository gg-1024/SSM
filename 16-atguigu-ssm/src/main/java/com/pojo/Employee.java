package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Employee {

    private int empId;

    private String empName;

    private String gender;
    private Department department;

    private String email;
    private String dId;


    public Employee(int empId, String empName, String gender, String email, String dId) {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
    }
}
