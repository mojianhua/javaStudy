package test;

import bean.CarNew;
import bean.PersonNew;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest2 {

    private static ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc3.xml");

    public static void main(String[] args){
        PersonNew personNew = (PersonNew) ioc.getBean("person01");
        //在ioc3 里面set了lastName是null
        System.out.println(personNew.getLastName());
        System.out.println(personNew.getCarNew());

        CarNew carNew = personNew.getCarNew();
        Object bean2 = ioc.getBean("car01");
        System.out.println(carNew);

        CarNew carNew2 = (CarNew) ioc.getBean("car01");
        carNew2.setCarName("自行车");
        System.out.println("修改了容器中的car,+" + personNew.getCarNew());
    }
}
