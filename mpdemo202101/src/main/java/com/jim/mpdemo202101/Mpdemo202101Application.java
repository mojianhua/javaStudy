package com.jim.mpdemo202101;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jim.mpdemo202101.mapper")
public class Mpdemo202101Application {

    public static void main(String[] args) {
        SpringApplication.run(Mpdemo202101Application.class, args);
    }

}
