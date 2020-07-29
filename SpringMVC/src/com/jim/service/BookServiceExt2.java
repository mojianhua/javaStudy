package com.jim.service;

import com.jim.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceExt2 {

    //自动装配，自动的为这个属性赋值
    @Autowired
    private BookDao bookDao;

    public void save(){
        System.out.println("BookService........正要进行运行BookDao中的saveBook");
        bookDao.saveBook();
    }
}
