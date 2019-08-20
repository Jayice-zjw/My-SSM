package com.jay.service.impl;

import com.jay.service1.StudentService;

public class StudentServiceImpl implements StudentService {

	public StudentServiceImpl() {
		System.out.println("构造器");
	}

	@Override
	public void study() {
		System.out.println("好好学习");

	}

	public void init() {
		System.out.println("bean初始化");
	}

	public void destroy() {
		System.out.println("bean销毁");
	}

}
