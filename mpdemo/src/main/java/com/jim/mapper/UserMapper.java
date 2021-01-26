package com.jim.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jim.entity.User;
import org.springframework.stereotype.Repository;

//BaseMapper用来实现Mybatis-Plus的增强功能
@Repository
public interface UserMapper extends BaseMapper<User> {
}

