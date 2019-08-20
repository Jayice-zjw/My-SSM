package com.jay.dao.impl;

import org.springframework.stereotype.Repository;

import com.jay.dao1.student;

@Repository("student")
public class studentImpl implements student {

	@Override
	public void study() {
		System.out.println("好好学习");
		
	}

	

}
