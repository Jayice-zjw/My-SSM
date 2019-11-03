package com.jay.test;

import com.jay.aop.MyInvocationHandler;
import com.jay.dao.UserDao;
import com.jay.dao.impl.UserDaoImpl;
import com.jay.service.StudentService;
import com.jay.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

public class test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从spring中获取对象
        StudentService studentService = (StudentService) context.getBean("studentService");
        studentService.study();
        //将context关闭，此时会执行destroy方法
        ((ClassPathXmlApplicationContext)context).close();
    }

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.addUser();
    }

    @Test
    public void testAop(){
        //创建目标类对象
        UserDao userDao = new UserDaoImpl();

        //创建代理
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), new MyInvocationHandler(userDao));

        userDaoProxy.addUser();
    }
}
