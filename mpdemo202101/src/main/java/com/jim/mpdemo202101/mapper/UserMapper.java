package com.jim.mpdemo202101.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jim.mpdemo202101.entity.User;
import org.springframework.stereotype.Repository;

//BaseMapper用来实现Mybatis-Plus的增强功能
@Repository
public interface UserMapper extends BaseMapper<User> {
}
