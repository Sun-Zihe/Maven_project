package com.szh.test;

import com.szh.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        UserService userService = applicationContext.getBean(UserService.class);

        userService.add();

        System.out.println("-------------");

        userService.update();
    }
}
