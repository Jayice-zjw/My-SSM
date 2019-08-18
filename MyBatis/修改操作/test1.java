package com.jay.test;

import org.junit.Test;

import com.jay.bean.Student;
import com.jay.dao.studentDao;
import com.jay.dao.impl.studentDaoImpl;

public class test01 {

	private studentDao studentDao;

	@Test
	public void insertStudent() {
		studentDao = new studentDaoImpl();
		Student student = new Student("陈奕迅", 43, 97.00);

		studentDao.insertStudent(student);
	}

	@Test
	public void deleteStudent() {
		studentDao = new studentDaoImpl();
		studentDao.deleteStudent(5);
	}
	
	@Test
	public void updateStudent() {
		Student student=new Student("周杰伦",40,100);
		student.setId(1);
		studentDao = new studentDaoImpl();
		studentDao.updateStudent(student);
		
	}
}
