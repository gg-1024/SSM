package com.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.Employee;
import com.pojo.Msg;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/emps")
    @ResponseBody
    public Msg getEmpsWithJson(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<Employee> emps = employeeService.getAllEmployee();
        PageInfo page = new PageInfo(emps, 5);
        return Msg.success().add("pageInfo", page);
    }

    @RequestMapping("/emps2")
    public String getEmployeeList(
            @RequestParam(value = "pn",defaultValue = "1")int pn, Model model){

        //引入pageHelper分页插件
        //在查询之前只需要调用，传入页码，及每页大小
        PageHelper.startPage(pn, 5);
        //PageHelper后面紧跟的查询就是分页查询
        List<Employee> employeeList = employeeService.getAllEmployee();
        //使用PageInfo包装查询后的结果，只需要将pageInfo交给页面就可以了
        //封装了分页的详细信息，包括查询出来的数据，传入连续的页数
        PageInfo pageInfo = new PageInfo(employeeList,5);
        model.addAttribute("pageInfo",pageInfo);
        return "list";
    }

    /**
     * 前端已经校验过了，但是容易被人跳过，所以后端也要校验
     * 要支持JSR303,首先应该添加 hibernate-validator 依赖
     * @param employee
     * @return
     */
    @RequestMapping(value = "/emps",method = RequestMethod.POST)
    @ResponseBody
    public Msg insertEmployee(@Valid Employee employee, BindingResult result){
        if (result.hasErrors()){
            Map<String, Object> errorMap = new HashMap<>();
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError error : errors) {
                errorMap.put(error.getField(),error.getDefaultMessage());
                System.out.println("错误字段"+error.getField());
                System.out.println("错误信息"+error.getDefaultMessage());
            }
            return Msg.defeat().add("errorFields",errorMap);
        }else {
            System.out.println(employee.toString());
            int i = employeeService.insertEmployee(employee);
            return Msg.success().add("msg",i);
        }
    }

    @RequestMapping("/checkEmployee")
    @ResponseBody
    public Msg checkEmployeeNumber(String empName){
        System.out.println(1);
        if(employeeService.checkEmployeeNumber(empName) == 0){
            return Msg.success().add("msg","");
        }else {
            return Msg.defeat().add("msg","此用户名已被使用");
        }
    }

    @RequestMapping("/emp/{empId}")
    @ResponseBody
    public Msg getEmployeeById(@PathVariable("empId") int empId){
        Employee employee = employeeService.getEmployeeById(empId);
        return Msg.success().add("employee",employee);
    }


}
