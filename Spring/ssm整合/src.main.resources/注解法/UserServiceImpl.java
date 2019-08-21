package com.jay.service.impl;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jay.service.UserService;

@Transactional
public class UserServiceImpl implements UserService {

	@Override
	//当发生异常时回滚
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = NullPointerException.class)
	public void adduser() {
		System.out.println("用戶添加");

	}

}
