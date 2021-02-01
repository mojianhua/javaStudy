package com.jim.edu.controller;


import com.jim.edu.entity.Teacher;
import com.jim.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author testjava
 * @since 2021-02-01
 */
@RestController
@RequestMapping("/edu/teacher")
public class TeacherController {
    //把service注入
    @Autowired
    private TeacherService teacherService;

    //1、查询表数据
    //rest风格，访问地址：http://localhost:8001//edu/teacher/findAll
    @GetMapping("findAll")
    public List<Teacher> findAllTeacher(){
        //调用service的方法实现所有的操作
        List<Teacher> list = teacherService.list(null);
        return list;
    }
}

