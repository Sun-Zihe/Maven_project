package com.fc;

import com.fc.config.TestConfig;
import com.fc.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        //从容器中获取对象
        TestConfig testConfig = applicationContext.getBean(TestConfig.class);

        System.out.println("hashcode：" + testConfig.hashCode());
        System.out.println("地址：" + testConfig);
//
//        User user1 = applicationContext.getBean(User.class);
//        User user2 = applicationContext.getBean(User.class);
//
//        System.out.println("容器中的两个对象" + (user1 == user2));
    }


}
