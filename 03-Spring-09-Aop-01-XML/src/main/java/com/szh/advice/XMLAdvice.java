package com.szh.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class XMLAdvice {

    public void before(){
        System.out.println("前置通知，会在方法执行前执行");
    }

    public void afterReturning(){
        System.out.println("后置通知，会在方法执行之后执行");
    }

    public void afterThrowing(){
        System.out.println("异常通知，发生异常执行");
    }

    public void after(){
        System.out.println("最终通知，无论发生什么异常都会执行");
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知之前");

        //执行方法
        Object proceed = joinPoint.proceed();

        System.out.println("环绕通知之后");

        return proceed;
    }

}
