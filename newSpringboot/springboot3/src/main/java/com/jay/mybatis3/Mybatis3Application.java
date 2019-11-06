package com.jay.mybatis3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.jay.mybatis3.mapper")  //扫描该包下的所有mapper，其实也就是dao
@EnableTransactionManagement //开启事务支持
@ServletComponentScan("com.jay.mybatis3.filter")  //扫描该包下面的javaee的注解，比如说过滤器
public class Mybatis3Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis3Application.class, args);
    }

}
