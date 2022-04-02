package com.szh.test;

import com.szh.controller.UserController;
import com.szh.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {
   @Test
    public void testIoc(){
       AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.szh");
       UserController userController = applicationContext.getBean(UserController.class);
       System.out.println();
   }

   @Test
   public void testDI(){
      ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

      UserController controller = applicationContext.getBean(UserController.class);

      List<User> list = controller.findAll();

      System.out.println(list);


   }
   @Test
   public void testValue() {
      ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

      applicationContext.close();
   }
}

