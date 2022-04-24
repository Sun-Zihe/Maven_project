package com.fc.config;

import com.fc.entity.Car;
import com.fc.entity.Person;
import com.fc.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

//此注解表示当前类是一个配置类，这个参数代表是否使用代理来创建对象，这样创建的对象并不是真实对象
@Configuration(proxyBeanMethods = false)
public class TestConfig {
    //将这个方法注入到容器中，还可以指定一个或多个对象名
    @Bean({"car", "car1", "car2"})
    public Car getCar(){
        return new Car("特斯拉","星空银");
    }

    //参数car会自动从容器中获取
    @Bean
    public Person getPerson(Car car){
        return new Person("安柏",getCar());
    }

    @Bean
    //将User对象注入到容器中
    public User getUser(){
        return new User();
    }

    public TestConfig(){
        System.out.println("构造方法");
    }

    public String test(){
        return "牛逼666";
    }


    // 被@PostConstruct声明的方法会在服务器加载时直接执行
    // 构造方法以及@Autowired之后执行。并且会在Servlet的init方法之前执行
    // 只要是JavaWeb都能够使用这个注解
    @PostConstruct
    public void init() {
        System.out.println("初始化");
    }
}


