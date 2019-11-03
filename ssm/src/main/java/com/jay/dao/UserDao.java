package com.jay.dao;

import com.jay.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    void addUser(User user);

    void updateUser(User user);

    List<User> selectUsers();

    User selectUserById(int id);

    void deleteUser(int id);
}
