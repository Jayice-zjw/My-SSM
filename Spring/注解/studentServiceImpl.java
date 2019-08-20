package com.jay.service1.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jay.service.impl.studentService;

@Repository("studentService")
public class studentServiceImpl implements studentService {
	@Autowired
	studentService sd;
	
	@Override
	public void study() {
		sd.study();
		
	}

}
