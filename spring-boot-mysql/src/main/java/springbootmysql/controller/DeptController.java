package springbootmysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springbootmysql.bean.Department;
import springbootmysql.bean.Employees;
import springbootmysql.mapper.DepartmentMapper;
import springbootmysql.mapper.EmployeesMapper;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeesMapper employeesMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    //访问连接：http://127.0.0.1:8088/dept?departmentName=AA
    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employees getEmp(@PathVariable("id") Integer id){
        return employeesMapper.getEmpNewById(id);
    }
}
