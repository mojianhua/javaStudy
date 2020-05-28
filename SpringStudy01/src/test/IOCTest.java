package test;

import bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
    public static void main(String[] args){
        //ApplicationContext：代表ioc容器，ClassPathXmlApplicationContext：配置文件在ClassPath下
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
        //根据IOC容器中获取Bean实例
        Person bean = (Person) ioc.getBean("person01");
        //调用getAge方法
        System.out.println(bean.getAge());
    }
}
