package com.fc.config;

import com.fc.entity.Bike;
import com.fc.entity.Car;
import com.fc.entity.Person;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//被 @Configuration 修饰的类作为一个配置类，相当于 xml 配置文件，会在启动时被加载到 Spring 容器中。
//通常和 @Bean 标签配合使用，相当于 xml 配置文件中的 Bean 标签。
@Configuration
public class BeanConfig {
    @Bean("car")
    @ConditionalOnMissingBean({Car.class, Bike.class})
    @ConditionalOnBean(Person.class)
    public Car getCar(){
        Car car = new Car();

        car.setBrand("BYD");

        return car;
    }

    @Bean("car2")
    public Car getCar2() {
        Car car = new Car();

        car.setBrand("特斯拉");

        return car;
    }

}
