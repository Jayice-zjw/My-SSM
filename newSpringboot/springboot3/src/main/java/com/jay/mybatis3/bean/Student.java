package com.jay.mybatis3.bean;

import lombok.Data;

@Data  //自动生成getter和setter
public class Student {

    private Integer id;

    private String name;

    private Integer age;

    private Double score;
}
