package com.jim.test;

import com.jim.service.BookServiceNew;
import com.jim.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest2 {

    private static ApplicationContext ioc = new ClassPathXmlApplicationContext("conf/applicationContent2.xml");
    public static void main(String[] args){
        /**
         * java泛型
         *  1、BaseService中加加入<T>这个T表示消除强制类型转换
         *  2、使用具体Service的时候传入指定的类名，因为泛型是根据类名实例化的
         *     2.1、如需要实例化BookService，则提前需要新建一个Book.class，在继承baseService的时候传入Book.class；
         *     2.2、在BaseService里面调用组件实例化BaseDao类，同时加入，加入<T>泛式使用
         *     2.3、定义调用方法，因为BaseDao是抽象类，所有方法要跟BaseDao一致；
         *  3、最后新建一个BaseDao和具体使用的Dao，实例化Dao的使用；
         *     3.1、如，需要使用BookDao,则先新建BaseDao和BookDao；
         *     3.2、BookDao继承于BaseDao；
         *     3.3、定义baseDao抽象类和抽象方法
         * */
        BookServiceNew bookServiceNew = ioc.getBean(BookServiceNew.class);
        UserService userService = ioc.getBean(UserService.class);
        bookServiceNew.save();
        userService.save();

        //打印最终调用的class名字，（最终的父类的类型是：class com.jim.service.BaseService）
        System.out.println(bookServiceNew.getClass().getSuperclass());
        //打印最终调用的class名字，（最终的父类的类型是：com.jim.service.BaseService<com.jim.bean.Book>）
        System.out.println(bookServiceNew.getClass().getGenericSuperclass());
    }
}
