package test;

import bean.Car;
import bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {

    public static void main(String[] args){
//        //ApplicationContext：代表ioc容器，ClassPathXmlApplicationContext：配置文件在ClassPath下
////        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
//        //根据IOC容器中获取Bean实例
////        Person bean = (Person) ioc.getBean("person01");
//        //只有一个对象的情况下能使用
////        Person bean = ioc.getBean(Person.class);
//        //如果需要直接用class调用bean,则指定对象
////        Person bean = ioc.getBean("person02",Person.class);
//
////        Person bean = ioc.getBean("person04",Person.class);
//
//        ApplicationContext ioc2 = new ClassPathXmlApplicationContext("ioc2.xml");
//        Person person01 = (Person) ioc2.getBean("person01");
////        //调用getAge方法
////        System.out.println(bean2.getLastName());
//
//        Object car = ioc2.getBean("car01");
//        System.out.println("容器中的car："+car);
//        System.out.println("Person中的car:"+person01.getCar());
    }
}
