package com.szh.config;


import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Properties;

//用于指定 properties 文件的位置
@PropertySource("classpath:jdbc.properties")
//扫描指定包下的注解
@ComponentScan("com.szh")
//当前类是一个配置类
@Configuration
public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    //这个@Bean注解用于将指定方法的返回值作为容器的对象
    //方法名就是配置文件中的id值
    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = null;

        Properties properties = new Properties();

        properties.setProperty("driverClassName", driverClassName);
        properties.setProperty("url", url);
        properties.setProperty("username", username);
        properties.setProperty("password", password);

        DataSource dataSource;

        try {
            // 通过数据源工厂获取数据源并且加载Properties中的配置
            dataSource = DruidDataSourceFactory.createDataSource(properties);

            jdbcTemplate = new JdbcTemplate(dataSource);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jdbcTemplate;


    }
}
