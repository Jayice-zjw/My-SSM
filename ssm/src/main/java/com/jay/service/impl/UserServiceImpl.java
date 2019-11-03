package com.jay.service.impl;

import com.jay.bean.User;
import com.jay.dao.UserDao;
import com.jay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = NullPointerException.class)
    public void addUser(User user) throws Exception {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
        throw new RuntimeException();

    }

    @Override
    public List<User> selectUsers() {

        return userDao.selectUsers();
    }

    @Override
    public User selectUserById(int id) {

        return userDao.selectUserById(id);
    }

    @Override
    public void deleteUser(int id){
        userDao.deleteUser(id);
        throw new RuntimeException();

    }
}
