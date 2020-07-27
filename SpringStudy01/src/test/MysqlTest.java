package test;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class MysqlTest {

    private static ConfigurableApplicationContext iocTest1 = new ClassPathXmlApplicationContext("applicationContent02.xml");

    public static void main(String[] args){
        //1、容器中拿到连接池
        DataSource mysql01 = (DataSource) iocTest1.getBean("dataSource");
        System.out.println(mysql01);
    }
}
