package com.jay.aop;
public class MyAspect {
    public void before() {
        System.out.println("========前置通知========");
    }

    public void after() {
        System.out.println("========最终通知========:");
    }

    public void afterThrowing(Exception e) {
        System.out.println("========异常通知========:" + e);
    }

    public void afterReturning(int result) {
        System.out.println("========后置通知========:" + result);
    }
}
