package test;

import bean.BookNew;
import java.util.List;
import bean.PersonNew;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class IOCTest2 {

    private static ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc3.xml");

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

        //集合类型命名空间，util
        PersonNew personNew06 = (PersonNew) ioc.getBean("personNew05");
        Map<String,Object> maps = personNew06.getMaps();
        System.out.println(maps);
    }
}
