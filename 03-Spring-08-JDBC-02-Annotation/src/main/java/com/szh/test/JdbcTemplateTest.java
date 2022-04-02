package com.szh.test;

import com.szh.config.JdbcConfig;
import com.szh.entity.User;
import com.szh.impl.JDBCTemplateDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcTemplateTest {

    @Test
    public  void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JdbcConfig.class);

        JDBCTemplateDaoImpl templateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);

        int user = templateDao.findCount();

        System.out.println(user);


    }


}
