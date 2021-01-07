package com.dorms.service;

import com.dorms.entity.User;
import com.dorms.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int create(User user){
        return userMapper.create(user);
    }

    public int delete(Integer id){
        return userMapper.delete(id);
    }

    public int update(User user){
        return userMapper.update(user);
    }

    //普通分页列表
    public List<User> query(User user){
        if(user != null && user.getPage() != null){
            PageHelper.startPage(user.getPage(),user.getLimit());
        }
        return userMapper.query(user);
    }

    //丰富的分页列表
    public PageInfo<User> queryAdd(User user){
        if(user != null && user.getPage() != null){
            PageHelper.startPage(user.getPage(),user.getLimit());
        }

        PageInfo<User> pageInfo = new PageInfo(userMapper.query(user));
        return pageInfo;
    }

    public User detail(Integer id){
        return userMapper.detail(id);
    }
}
