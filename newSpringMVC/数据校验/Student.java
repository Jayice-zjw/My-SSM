package com.jay.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Student {
    @NotEmpty(message = "姓名不能为空")
    @Size(min=3,max = 20,message = "姓名长度需要在{min}和{max}之间")
    String name;

    @Min(value = 0,message = "年龄不能小于{value}")
    @Max(value =120,message = "年龄不能大于{value}")
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
