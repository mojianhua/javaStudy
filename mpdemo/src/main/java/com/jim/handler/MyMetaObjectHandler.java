package com.jim.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

//自动填充类
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    //使用mp实现添加操作，这个方法执行
    @Override
    public void insertFill(MetaObject metaObject){
        //自动填充添加时间
        this.setFieldValByName("createTime",new Date(),metaObject);
        //自动填充更新时间
        this.setFieldValByName("updateTime",new Date(),metaObject);
        this.setFieldValByName("version",1,metaObject);
    }

    //使用mp实现修改操作，这个方法执行
    @Override
    public void updateFill(MetaObject metaObject){
        //自动填充更新时间
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }
}
