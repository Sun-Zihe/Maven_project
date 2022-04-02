package com.szh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.Connection;

@Data
@AllArgsConstructor

//将当前类的对象
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class User {
    @Value("101")
    private Integer id;
    @Value("蔡健雅")
    private String username;
    @Value("123")
    private String password;

    public User() {System.out.println("无参构造"+this);}

    //
    @PostConstruct
    public void eat(){
        System.out.println("歌曲：红色高跟鞋");
    }

}
