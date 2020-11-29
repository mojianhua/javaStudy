package com.jim.config;

import com.jim.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration指明当前是一个配置类，就是来替代之前的Spring配置文件
 * 在配置文件中用<bean></bean>标签添加组件
 * */

@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService(){
        System.out.println("配置类中@Bean容器中添加了组件了。。。。。");
        return new HelloService();
    }
}
