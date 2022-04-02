package com.szh.test;

import com.szh.entity.Car;
import com.szh.entity.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = applicationContext.getBean("car", Car.class);
        System.out.println(car);
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
        applicationContext.close();
    }
}
