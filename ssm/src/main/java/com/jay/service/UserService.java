package com.jay.service;

import com.jay.bean.User;

import java.util.List;

public interface UserService {
    void addUser(User user) throws Exception;

    void updateUser(User user);

    List<User> selectUsers();

    User selectUserById(int id);

    void deleteUser(int id) throws Exception;
}
