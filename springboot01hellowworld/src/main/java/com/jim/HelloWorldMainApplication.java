package com.jim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring boot应用
 * @ImportResource(locations = {"classpath:beans.xml"}):导入spring配置文件，让配置文件里面的内容生效
 *      Spring boot里面没Spring配置文件，我们自己编写的配置文件，也不能自动识别；
 *      想让Spring的配置文件生效，加载进来，@ImportResource标准在一个配置类上
 * */

@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args){
        // Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
