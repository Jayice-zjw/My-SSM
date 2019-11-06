package com.jay.mybatis3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.jay.mybatis3.mapper")  //扫描该包下的所有mapper，其实也就是dao
@EnableTransactionManagement //开启事务支持
public class Mybatis3Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis3Application.class, args);
    }

}
