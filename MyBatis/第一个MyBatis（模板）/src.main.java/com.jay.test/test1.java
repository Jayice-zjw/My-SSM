package com.jay.test;

import org.junit.Test;

import com.jay.bean.Student;
import com.jay.dao.studentDao;
import com.jay.dao.impl.studentDaoImpl;

public class test01 {
	@Test
	public void insertStudent() {
		studentDao studentDao = new studentDaoImpl();
		Student student = new Student("林俊杰", 36, 97.00);

		studentDao.insertStudent(student);
	}
}
