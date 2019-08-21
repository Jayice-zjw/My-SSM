package com.jay.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jay.dao1.StudentDao;
import com.jay.service1.StudentService;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {
	// @Autowired
	private StudentDao studentDao;

	@Override
	public void play() {
		studentDao.play();

	}
	
	//这两个注解都是Java提供的
	@PostConstruct
	public void before() {
		System.out.println("开始");
	}

	@PreDestroy
	public void after() {
		System.out.println("结束");
	}

	public StudentServiceImpl(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	public void init() {
		System.out.println("init");
	}

	public void destroy() {
		System.out.println("destroy");
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
/*
开始
好好学习
结束
*/
