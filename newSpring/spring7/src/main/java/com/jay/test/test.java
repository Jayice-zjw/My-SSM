package com.jay.test;

import com.jay.aop.MyInvocationHandler;
import com.jay.dao.UserDao;
import com.jay.dao.impl.UserDaoImpl;
import com.jay.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

public class test {

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

    @Test
    public void testApsect(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.addUser();
        System.out.println("#####################");

        userService.updateUser();
        System.out.println("#####################");

        try {
            userService.selectUserById(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("#####################");


        userService.selectUser();
        System.out.println("#####################");
    }
}
