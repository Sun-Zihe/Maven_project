package com.szh.test;

import com.szh.config.AopConfig;
import com.szh.service.UserService;
import com.szh.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class XMLTest {
    @Test
    public void testAnnotation(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        UserService bean = context.getBean(UserService.class);
        bean.add();
        System.out.println("--------------------------");
        bean.update();
    }



}
