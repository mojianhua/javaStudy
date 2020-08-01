package com.jim.test;

import com.jim.service.BookServiceNew;
import com.jim.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest2 {

    private static ApplicationContext ioc = new ClassPathXmlApplicationContext("conf/applicationContent2.xml");
    public static void main(String[] args){
        BookServiceNew bookServiceNew = ioc.getBean(BookServiceNew.class);
        UserService userService = ioc.getBean(UserService.class);
        bookServiceNew.save();
        userService.save();
    }
}
