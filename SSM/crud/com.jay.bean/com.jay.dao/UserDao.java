package com.jay.dao;

import java.util.List;

import com.jay.bean.User;

public interface UserDao {
	void addUser(User user);

	void updateUser(User user);

	List<User> selectUsers();

	User selectUserById(int id);

	void deleteUser(int id);
}
