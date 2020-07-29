package com.jim.test;

import com.jim.servlet.BookServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class IOCTest {
    private static ApplicationContext ioc = new ClassPathXmlApplicationContext("conf/applicationContent.xml");


    public static void main(String[] args) throws SQLException {
        /**
         * 使用注解加入到容器中的组件，和使用配置加入到容器中的组件行为默认一样的，
         * 1、组件id.默认是组件类名的手字母小写
         * 2、组件的作用域默认就是单例模式
         * */
//        Object bean1 = ioc.getBean("bookDao");
//        Object bean2 = ioc.getBean("bookDao");
//        System.out.println(bean1 == bean2);

        BookServlet bookServlet = ioc.getBean(BookServlet.class);
        bookServlet.doGet();
    }
}
