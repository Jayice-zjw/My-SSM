package com.jay.service.impl;

import com.jay.dao.UserDao;
import com.jay.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public void addUser() {
        userDao.addUser();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
