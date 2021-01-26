package com.jim.mpdemo;

import com.jim.entity.User;
import com.jim.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MpdemoApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
    }

    //查询user表所有数据
    @Test
    public void findAll(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
        
    }
}
