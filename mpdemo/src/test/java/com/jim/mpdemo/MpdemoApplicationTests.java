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

    //添加操作
    @Test
    public void addUser(){
        User user = new User();
        user.setName("jj1号");
        user.setAge(90);
        user.setEmail("jjj123@qq.com");
        userMapper.insert(user);
    }

    //根据ID修改操作
    @Test
    public void updateUser(){
        User user = new User();
        user.setId(1355062884183543811L);
        user.setAge(120);
        int row = userMapper.updateById(user);
        System.out.println(row);
    }
}
