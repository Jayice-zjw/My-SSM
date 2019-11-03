package com.jay.log;

public class Transaction {
    public static void doTransaction(Class<?> clazz){
        System.out.println("提交事务:" + clazz.getName());
    }
}
