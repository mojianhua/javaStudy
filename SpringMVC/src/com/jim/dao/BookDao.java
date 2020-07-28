package com.jim.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * id默认是类名首字母小写
 * @Repository(可以修改组件名称)
 * 开启多实例模式
 * @Scope(value=“prototype”)
 * */
@Repository
public class BookDao {
}
