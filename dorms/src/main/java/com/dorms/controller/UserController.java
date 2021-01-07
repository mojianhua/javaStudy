package com.dorms.controller;

import com.dorms.entity.User;
import com.dorms.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //url:http://localhost:8882/dorms/user/create
    @GetMapping("create")
    public void create(){
        User user = new User();
        user.setUserName("admin");
        user.setName("admin");
        user.setPassword("1234566");
        userService.create(user);
    }

    //url：http://localhost:8882/dorms/user/delete?id=9
    @GetMapping("delete")
    public void delete(Integer id){
        userService.delete(id);
    }

    @GetMapping("update")
    public void update(){
        User user = new User();
        user.setName("adminxxxxx");
        user.setUserName("adminxxxxxxxxxxxxxxxxxxx");
        user.setPassword("123456xxxxxx");
        user.setId(1);
        userService.update(user);
    }

    @GetMapping("detail")
    public User detail(Integer id){
        return userService.detail(id);
    }

    @GetMapping("query")
    public List<User> query(User user){
        return userService.query(user);
    }

    @GetMapping("queryAdd")
    //丰富分页
    public PageInfo<User> queryAdd(User user){
        return userService.queryAdd(user);
    }
}
