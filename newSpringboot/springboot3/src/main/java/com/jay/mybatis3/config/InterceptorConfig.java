package com.jay.mybatis3.config;

import com.jay.mybatis3.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//拦截器配置类
@Configuration
public class InterceptorConfig implements WebMvcConfigurer{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
        InterceptorRegistration ir=registry.addInterceptor(new MyInterceptor());
        //添加拦截请求
        ir.addPathPatterns("/*");
        //添加不拦截的请求
        ir.excludePathPatterns("/login");

    }
}
