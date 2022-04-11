package com.fc.entity;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//条件装配，满足条件才能装配
@Profile("test")
@Data
//注解用于将整个文件映射成一个对象，用于自定义配置项比较多的情况
@ConfigurationProperties(prefix="student")
//将此类注入到容器中，或者在配置类中添加一个注解
@Component
public class Son implements Student {

    private String name;
    private Integer age;


}
