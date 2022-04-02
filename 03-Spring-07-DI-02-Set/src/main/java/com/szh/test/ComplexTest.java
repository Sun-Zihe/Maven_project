package com.szh.test;

import com.szh.entity.ComplexType;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComplexType bean = applicationContext.getBean(ComplexType.class);
        System.out.println(bean);
    }
}
