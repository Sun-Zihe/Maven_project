package com.szh.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//扫描指定包下的类
@ComponentScan("com.szh")
//声明一个配置类
@Configuration
//开启切面自动代理，并设置代理模式,
//代理模式false是cglib代理的，是一个接口，当他的值为true是jdk代理的，是一个类
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class AopConfig {

}
