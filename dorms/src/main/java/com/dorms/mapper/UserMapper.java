package com.dorms.mapper;

import com.dorms.entity.User;

import java.util.List;

public interface UserMapper {

    int create(User user);

    int delete(Integer id);

    int update(User user);

    List<User> query(User user);

    User detail(Integer id);
}
