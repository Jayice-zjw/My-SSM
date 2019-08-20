package com.jay.service1.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jay.service.impl.studentService;


//Autowired和Resource的区别。Autowired由Spring提供，默认根据类型装配，而Resource又java提供，默认根据名字进行装配
@Repository("studentService")
public class studentServiceImpl implements studentService {
	@Autowired
	@Resource("studentDao1")
	studentService sd;
	
	@Override
	public void study() {
		sd.study();
		
	}

}
