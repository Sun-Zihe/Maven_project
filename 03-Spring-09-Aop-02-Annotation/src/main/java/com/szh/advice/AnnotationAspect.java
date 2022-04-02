package com.szh.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//声明一个切面类
@Aspect
//设置一个bean类，可以被ComponentScan扫描到当前类的路径，可以有一个id参数，通过设置的id找到当前类
@Component
public class AnnotationAspect {
    //设置一个切点
    @Pointcut("execution(* com.szh.service.impl.*ServiceImpl.*(..))")
    public static void pointcut(){}

    //设置前置通知,路径是  切点所在的类名.切点，可以跨类进行织入，所以切点最好是静态方法。
    @Before("AnnotationAspect.pointcut()")
    public void before(){
        System.out.println("前置通知，在方法执行前执行");
    }

    //设置后置通知
    @AfterReturning("AnnotationAspect.pointcut()")
    public void afterReturning(){
        System.out.println("后置通知，在方法后通知");
    }

    //设置最后通知
    @After("AnnotationAspect.pointcut()")
    public void after(){
        System.out.println("最终通知，无论报错都会执行");
    }

    //设置异常通知
    @AfterThrowing("AnnotationAspect.pointcut()")
    public void afterThrowing(){
        System.out.println("异常通知，发生异常执行");
    }

    //设置环绕通知

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知之前");

        //执行方法
        Object proceed = joinPoint.proceed();

        System.out.println("环绕通知，之后");

        return proceed;
    }

}
