package com.jim.edu.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jim.commonutils.R;
import com.jim.edu.entity.Teacher;
import com.jim.edu.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    //1.1、查询表数据统一返回格式
    //rest风格，访问地址：http://localhost:8001/edu/teacher/findAllR
    @ApiOperation(value = "所有讲师列表(统一返回格式)")
    @GetMapping("findAllR")
    public R findAllTeacherR(){
        //调用service的方法实现所有的操作
        List<Teacher> list = teacherService.list(null);
        return R.ok().data("item",list);
    }

    /**1.2分页查询讲师的方法，
     * current 当前页
     * limit 每页记录数
    */
    @GetMapping("pageTeacher/{current}/{limit}")
    public R pageListTeacher(@PathVariable long current,@PathVariable long limit){
        //创建page对象
        Page<Teacher> pageTeacher = new Page<>(current,limit);
        //调用分页方法
        //调用方法的时候，底层封装，把分页数据封装到pageTeacher对象里面
        teacherService.page(pageTeacher,null);

        //记录总数
        long total = pageTeacher.getTotal(); //总记录数
        List<Teacher> records = pageTeacher.getRecords(); //数据list

        //赋值
        Map map = new HashMap();
        map.put("total",total);
        map.put("rows",records);
        return R.ok().data(map);
    }

    /**2、删除方法
     **/
    @ApiOperation("根据id删除讲师")
    @DeleteMapping("{id}") //id值通过路径进行传递，@PathVariable String id,获取路径中的id
    public R removeTeacher(@ApiParam(name="id",value="讲师ID",required = true) @PathVariable Long id){
        boolean flag = teacherService.removeById(id);
        if(flag){
            return R.ok();
        }else{
            return R.error();
        }
    }
}

