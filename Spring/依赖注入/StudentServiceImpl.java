package com.jay.service.impl;

import com.jay.dao.StudentDao;
import com.jay.service1.StudentService;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public void study() {
		studentDao.study();

	}

}
