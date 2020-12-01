package com.jim.springboot;

import com.jim.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试
 * 可以在测试期间方便的类似编码一样自动注入
 * */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testLogger(){
        //日志类使用
        //由低到高，可以调整输出日志级别，日志就只会在这个级别以后高级的生效，spring默认是info级别
        logger.trace("这是trace日志.....");
        logger.debug("这是debug日志.....");
        logger.info("这是info日志.....");
        logger.warn("这是warn日志....");
        logger.error("这是error日志.....");
    }

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

    @Test
    public void contentLoads(){
        System.out.println(person);
    }
}
