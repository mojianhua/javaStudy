package com.jim.dao;

import com.jim.bean.Book;
import org.springframework.stereotype.Repository;

/**
 * id默认是类名首字母小写
 * @Repository(可以修改组件名称)
 * 开启多实例模式
 * @Scope(value=“prototype”)
 * */
@Repository
public class BookDao extends BaseDao <Book>{

    public void saveBook(){
        System.out.println("图书已经保存.........");
    }

    @Override
    public void save(){
        System.out.println("BookDao正在做新的保存方法.......");
    }
}
