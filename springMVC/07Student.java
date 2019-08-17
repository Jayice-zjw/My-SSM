package com.monkey1024.controller;

public class Student {
	private String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private School school;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
}
