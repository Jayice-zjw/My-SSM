package com.jay.bean;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Student {
    @NotEmpty(message = "姓名不能为空")
    @Size(min=3,max = 20,message = "姓名长度需要在{min}和{max}之间")
    String name;

    @Range(min = 0,max = 120,message = "用户年龄在{min}至{max}之间")
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
