package com.jay.UserService.Impl;

import com.jay.UserService.UserService;

public class UserServiceImpl implements UserService {

	 @Override
	    public void addUser() {
	        System.out.println("执行service中的addUser方法");
	    }

	    @Override
	    public void selectUser() {
	        System.out.println("执行service中的selectUser方法");
	    }

	    @Override
	    public void selectUserById(int id) throws Exception{
	        System.out.println("执行service中的selectUserById方法");
	        if (id == 0){
	            throw new Exception();

	        }
	    }

	    @Override
	    public int updateUser() {
	        System.out.println("执行service中的updateUser方法");

	        return 1024;
	    }

	    @Override
	    public void deleteUser() {
	        System.out.println("执行service中的deleteUser方法");
	    }

}
