package com.jay.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jay.dao1.StudentDao;
import com.jay.service1.StudentService

//dao层用@Repository service层用@Service Controller层用@Controller

@Service("StudentService")
public class StudentServiceImpl implements StudentService {
	//@Autowired
	private StudentDao studentDao;
	
	@Override
	public void play() {
		studentDao.play();
		
	}
  //一定要有构造方法
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
