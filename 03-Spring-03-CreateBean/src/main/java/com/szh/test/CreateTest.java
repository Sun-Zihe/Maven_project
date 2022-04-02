package com.szh.test;

import com.szh.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreateTest {
   @Test
    public void testStatic(){
       ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       Student student = applicationContext.getBean("student", Student.class);
       System.out.println(student);
   }





}
