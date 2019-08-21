package com.jay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jay.bean.User;
import com.jay.dao.UserDao;
import com.jay.service.UserService;

@Transactional
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
		
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
		
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
	public void deleteUser(int id) {
		userDao.deleteUser(id);
		
	}

}
