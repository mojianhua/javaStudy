package com.dorms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.dorms.mapper"})
public class DormsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DormsApplication.class, args);
    }

}
