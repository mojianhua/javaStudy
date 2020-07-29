package com.jim.servlet;

import com.jim.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class BookServlet {

    /**
     * @Qualifier("bookService")：指定一个名作为id,让spring使用别的变量名作为id
     * @Autowire(required = false):如果找不到组件不报错直接返回null
     * 自动装配，自动的为这个属性赋值
     * @Autowire原理
     * private BookService bookService
     * 1)、先按照类型去容器中对应的组件，入上面例子，BookService就找BookService的类
     *     1）、找到一个，找到就赋值
     *     2）、没找到：抛异常
     *     3）、找到多个？
     *          1)、按照变量名作为id继续装配：bookService
     *              1）、匹配上；装配
     *              2）、没匹配？报错
     *                  因为我们按照变量名作为id继续匹配；
     *                  @Qualifier("bookService")
     *                  @Autowired
     *                  private BookService bookServiceExt2;指定一个新的id
     *                      1）、找到装配，
     *                      2）、找不到报错
     * */
    @Qualifier("bookService")
    @Autowired
    private BookService bookServiceExt2;

    public void doGet(){
        bookServiceExt2.save();
    }
}
