package com.jim.service;

import com.jim.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService <T> {

    @Autowired
    private BaseDao<T> baseDao;

    public void save(){
        System.out.println("自动注入的dao：" + baseDao);
        baseDao.save();
    }
}
