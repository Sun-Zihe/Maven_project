package com.szh.test;

import com.szh.impl.JDBCTemplateDaoImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateTest {

    @Test
    public  void testDelete(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);

        int delete = jdbcTemplateDao.delete(5);

        System.out.println(delete);


    }


}
