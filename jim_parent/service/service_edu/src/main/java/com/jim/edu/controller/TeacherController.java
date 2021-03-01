package com.jim.edu.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jim.commonutils.R;
import com.jim.edu.entity.Teacher;
import com.jim.edu.entity.vo.TeacherQuery;
import com.jim.edu.service.TeacherService;
import com.jim.servicebase.exceptionhandler.GuliException;
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
    @GetMapping("pageListTeacher/{current}/{limit}")
    public R pageListTeacher(@PathVariable long current, @PathVariable long limit){
        //创建page对象
        Page<Teacher> pageTeacher = new Page<>(current,limit);
        //调用方法实现分页
        //调用方法的时候，底层封装，把分页所有数据封装到pageTeacher对象里面
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

    /**1.3 条件查询带分页的方法，Get方式传参数
     * current 当前页
     * limit 每页记录数
     * teacherQuery 条件封装到对象teacherQuery中去
     */
    @GetMapping("pageTeacherConditionGet/{current}/{limit}")
    public R pageTeacherConditionGet(@ApiParam(name = "current", value = "当前页", required = true) @PathVariable long current,
                                  @ApiParam(name = "limit", value = "每页显示条数", required = true) @PathVariable long limit,
                                  @ApiParam(name = "teacherQuery", value = "查询对象", required = false) TeacherQuery teacherQuery){
        //创建page对象
        Page<Teacher> pageTeacher = new Page<>(current,limit);

        //构造条件
        QueryWrapper<Teacher> wrapper = new QueryWrapper<>();

        // 多条件组合查询
        String name = teacherQuery.getName();
        Integer level = teacherQuery.getLevel();
        String begin = teacherQuery.getBegin();
        String end = teacherQuery.getEnd();

        //wrapper
        if(!StringUtils.isEmpty(name)){
            wrapper.like("name",name);
        }

//        if(!StringUtils.isEmpty(level)){
//            wrapper.eq("level",level);
//        }

        if(!StringUtils.isEmpty(begin)){
            wrapper.gt("create_time",begin);
        }

        if(!StringUtils.isEmpty(end)){
            wrapper.lt("create_time",end);
        }

        //调用方法实现分页
        //调用方法的时候，底层封装，把分页所有数据封装到pageTeacher对象里面
        teacherService.page(pageTeacher,wrapper);

        //记录总数
        long total = pageTeacher.getTotal(); //总记录数
        List<Teacher> records = pageTeacher.getRecords(); //数据list
        //赋值
        Map map = new HashMap();
        map.put("total",total);
        map.put("rows",records);
        return R.ok().data(map);
    }

    /**1.3 条件查询带分页的方法，Post,用JSON传参数过去作作为查询条据
     * current 当前页
     * limit 每页记录数
     * teacherQuery 条件封装到对象teacherQuery中去
     */
    @PostMapping("pageTeacherConditionPost/{current}/{limit}")
    public R pageTeacherConditionPost(@ApiParam(name = "current", value = "当前页", required = true) @PathVariable long current,
                                  @ApiParam(name = "limit", value = "每页显示条数", required = true) @PathVariable long limit,
                                  @ApiParam(name = "teacherQuery", value = "查询对象", required = false) @RequestBody(required = false) TeacherQuery teacherQuery){
        try {
            int a = 10/0;
        }catch (Exception e){
            //执行自定义异常
            throw new GuliException(4000004,"执行自定义异常");
        }

        //创建page对象
        Page<Teacher> pageTeacher = new Page<>(current,limit);

        //构造条件
        QueryWrapper<Teacher> wrapper = new QueryWrapper<>();

        // 多条件组合查询
        String name = teacherQuery.getName();
        Integer level = teacherQuery.getLevel();
        String begin = teacherQuery.getBegin();
        String end = teacherQuery.getEnd();

        //wrapper
        if(!StringUtils.isEmpty(name)){
            wrapper.like("name",name);
        }

//        if(!StringUtils.isEmpty(level)){
//            wrapper.eq("level",level);
//        }

        if(!StringUtils.isEmpty(begin)){
            wrapper.gt("create_time",begin);
        }

        if(!StringUtils.isEmpty(end)){
            wrapper.lt("create_time",end);
        }

        //调用方法实现分页
        //调用方法的时候，底层封装，把分页所有数据封装到pageTeacher对象里面
        teacherService.page(pageTeacher,wrapper);

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

    /**
     * 添加讲师接口的方法
     * */
    @PostMapping("addTeacher")
    public R addTeacher(@RequestBody Teacher teacher){
        boolean save = teacherService.save(teacher);
        if(save){
            return R.ok();
        }else{
            return R.error();
        }
    }

    /**
     * 根据讲师IP进行查询
     * */
    @GetMapping("getTeacher/{id}")
    public R getTeacher(@PathVariable String id){
        Teacher teacher = teacherService.getById(id);
        return R.ok().data("teacher",teacher);
    }

    //更新讲师功能
    @PostMapping("updateTeacher")
    public R updateTeacher(@RequestBody Teacher teacher){
        boolean flag = teacherService.updateById(teacher);
        if(flag){
            return R.ok();
        }else {
            return R.error();
        }
    }
}

