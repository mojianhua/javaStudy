package factory;

import bean.BookNew;
import org.springframework.beans.factory.FactoryBean;

import java.util.UUID;

/**
 * spring 内置bean工厂模式是Spring可以认识的工厂类
 * Spring会自动的调用工厂方法创建实例
 * 1、编写一个FactoryBean的实现类
 * 2、在spring配置文件中进行注册
 * */
public class MyFactoryBeanImple implements FactoryBean <BookNew> {

    /**
     * getObject:工厂方法；返回创建对象
     * */
    @Override
    public BookNew getObject() throws Exception{
        System.out.println("MyFactoryBeanImple....帮你创建对象.....");
        BookNew bookNew = new BookNew();
        bookNew.setBookName(UUID.randomUUID().toString());
        return bookNew;
    }

    /**
     * 返回创建对象的类型
     * Spring会自动调用这个方法来确定创建的对象类型
     * */
    @Override
    public Class<?> getObjectType(){
        //ToDo
        return BookNew.class;
    }

    /**
     * isSingleton:是单例吗？
     * false:不是单例
     * true:是单例
     * */
    @Override
    public boolean isSingleton(){
        return false;
    }
}
