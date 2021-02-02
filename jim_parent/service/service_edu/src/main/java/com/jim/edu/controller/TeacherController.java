package com.jim.edu.controller;


import com.jim.edu.entity.Teacher;
import com.jim.edu.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author testjava
 * @since 2021-02-01
 */
@Api(description = "讲师管理")
@RestController
@RequestMapping("/edu/teacher")
@ResponseBody
public class TeacherController {
    //把service注入
    @Autowired
    private TeacherService teacherService;

    //1、查询表数据
    //rest风格，访问地址：http://localhost:8001/edu/teacher/findAll
    @ApiOperation(value = "所有讲师列表")
    @GetMapping("findAll")
    public List<Teacher> findAllTeacher(){
        //调用service的方法实现所有的操作
        List<Teacher> list = teacherService.list(null);
        return list;
    }

    /**2、删除方法
     **/
    @ApiOperation("根据id删除讲师")
    @DeleteMapping("{id}") //id值通过路径进行传递，@PathVariable String id,获取路径中的id
    public boolean removeTeacher(@ApiParam(name="id",value="讲师ID",required = true) @PathVariable Long id){
        boolean flag = teacherService.removeById(id);
        return flag;
    }
}

