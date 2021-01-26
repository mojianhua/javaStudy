package com.jim.entity;

import lombok.Data;

@Data
//引入lombok
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}