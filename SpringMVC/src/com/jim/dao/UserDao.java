package com.jim.dao;

import com.jim.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao <User> {

    @Override
    public void save(){
        System.out.println("UserDao保存用户............");
    }
}
