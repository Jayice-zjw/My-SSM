package com.jay.service.impl;

import com.jay.dao.UserDao;
import com.jay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("执行service中的addUser方法");
    }

    @Override
    public void selectUser() {
        System.out.println("执行service中的selectUser方法");
    }

    @Override
    public void selectUserById(int id) throws Exception{
        System.out.println("执行service中的selectUserById方法");
        if (id == 0){
            throw new Exception();

        }
    }

    @Override
    public int updateUser() {
        System.out.println("执行service中的updateUser方法");

        return 1024;
    }
}
