package test;


import bean.CarNew;
import bean.PersonNew;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.management.MBeanAttributeInfo;
import javax.sql.DataSource;
import java.sql.SQLException;

public class MysqlTest {

    private static ConfigurableApplicationContext iocTest1 = new ClassPathXmlApplicationContext("conf/applicationContent02.xml");
    private static ConfigurableApplicationContext iocTest2 = new ClassPathXmlApplicationContext("conf/applicationContent03.xml");

    public static void main(String[] args) throws SQLException {
//        //1、容器中拿到连接池
//        DataSource mysql01 = (DataSource) iocTest1.getBean("dataSource");
//        System.out.println(mysql01);

//        //2、按照类型获取组件，可以获取到这个类型下的所有体现类子类等等
//        DataSource mysql02 = iocTest1.getBean(DataSource.class);
//        System.out.println(mysql02.getConnection());

//        //获取car值
//        CarNew car1 = iocTest1.getBean(CarNew.class);
//        System.out.println(car1);

        //自动装配
        PersonNew personNew = iocTest2.getBean(PersonNew.class);
        System.out.println(personNew);
    }
}
