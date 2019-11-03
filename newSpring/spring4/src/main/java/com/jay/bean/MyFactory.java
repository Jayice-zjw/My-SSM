package com.jay.bean;

import com.jay.service.StudentService;
import com.jay.service.impl.StudentServiceImpl;

public class MyFactory {
    public static StudentService create(){
        return new StudentServiceImpl();
    }
}
