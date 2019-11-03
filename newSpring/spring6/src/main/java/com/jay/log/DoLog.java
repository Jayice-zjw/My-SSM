package com.jay.log;

public class DoLog {
    public static void doLog(Class<?> clazz){
        System.out.println("记录日志:" + clazz.getName());
    }
}
