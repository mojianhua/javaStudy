package com.jim.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

import static com.baomidou.mybatisplus.annotation.FieldFill.INSERT_UPDATE;

@Data
//引入lombok
public class User {

    @TableId(type = IdType.AUTO)   //自动增长
    private Long id;
    private String name;
    private Integer age;
    private String email;

    //create_time
    @TableField(fill = FieldFill.INSERT)    //当添加的时候自动填充
    private Date createTime;

    //update_time
    @TableField(fill = FieldFill.INSERT_UPDATE)   //当添加或更新的时候自动填充
    private Date updateTime;

    //加入乐观锁，并且要加入自动填充
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version; //版本号
}