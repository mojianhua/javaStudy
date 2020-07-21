package test;

import bean.BookNew;
import java.util.List;
import bean.PersonNew;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class IOCTest2 {

    //private static ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc3.xml");
    private static ApplicationContext ioc2 = new ClassPathXmlApplicationContext("ioc4.xml");

    public static void main(String[] args){
//        PersonNew personNew = (PersonNew) ioc.getBean("person011");
//        //在ioc3 里面set了lastName是null
//        System.out.println(personNew.getLastName());
//        System.out.println(personNew.getCarNew());
//
//        CarNew carNew = personNew.getCarNew();
//        Object bean2 = ioc.getBean("car011");
//        System.out.println(carNew);
//
//        CarNew carNew2 = (CarNew) ioc.getBean("car011");
//        carNew2.setCarName("自行车");
//        System.out.println("修改了容器中的car,+" + personNew.getCarNew());

//        //集合赋值类型List
//        PersonNew personNew03 = (PersonNew) ioc.getBean("personNew02");
//        List<BookNew> books = personNew03.getBooks();
//        System.out.println(books);

//        //集合类型maps
//        PersonNew personNew04 = (PersonNew) ioc.getBean("personNew03");
//        Map<String,Object> maps = personNew04.getMaps();
//        System.out.println(maps);

//        //集合类型properties
//        PersonNew personNew05 = (PersonNew) ioc.getBean("personNew04");
//        System.out.println(personNew05.getProperties());

//        //集合类型命名空间，util
//        PersonNew personNew06 = (PersonNew) ioc.getBean("personNew05");
//        Map<String,Object> maps = personNew06.getMaps();
//        System.out.println(maps);

//        // 级联属性，赋值，级联属性：属性的属性,注意：原来的bean的值可能被修改
//        PersonNew personNew07 = (PersonNew) ioc.getBean("personNew06");
//        System.out.println(personNew07.getCarNew());

          // bean继承问题
//          PersonNew personNew08 = (PersonNew) ioc.getBean("personNew07");
//          System.out.println(personNew08);

//            PersonNew personNew09 = (PersonNew) ioc.getBean("personNew08");
//            System.out.println(personNew09);

        //bean之间的依赖，（改变创建顺序）
        //System.out.println(ioc2);

//        //单例模式测试
//        Object personNew09 =  ioc2.getBean("carNew");
//        Object personNew092 = ioc2.getBean("carNew");
//        System.out.println(personNew09 == personNew092);

//        //静态工厂模式
//        Object airPlane01 = ioc2.getBean("airPlane01");
//        System.out.println(airPlane01);

//        //实例工厂模式
//        Object airPlane02 = ioc2.getBean("airPlane02");
//        System.out.println("容器启动完成..........." + airPlane02);

//        //FactoryBean(是Spring规定的一个接口)
//        Object bean = ioc2.getBean("myFactoryBeanImple");
//        System.out.println(bean);

        //bean生命周期，构造器------>初始化方法----->销毁方法
        Object bookNew01 = ioc2.getBean("bookNew011");
        System.out.println("容器关闭");
    }
}
