package com.jay.aop;

import com.jay.log.DoLog;
import com.jay.log.Transaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //记录日志
        DoLog.doLog(target.getClass());

        //业务逻辑
        Object invoke = method.invoke(target, args);

        //提交事务
        Transaction.doTransaction(target.getClass());

        return invoke;
    }
}