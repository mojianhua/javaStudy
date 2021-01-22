package com.jim.mpdemo202101;

import com.jim.mpdemo202101.entity.User;
import com.jim.mpdemo202101.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mpdemo202101ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    //查询user表所有数据
    @Test
    public void findAll(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
}
