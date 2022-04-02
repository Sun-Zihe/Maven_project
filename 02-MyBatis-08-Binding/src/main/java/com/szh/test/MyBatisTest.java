package com.szh.test;

import com.szh.dao.StudentDao;
import com.szh.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest {
    @Test
    public void testInsertOnObject()  {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = new Student();
            student.setName("神里凌华");
            student.setAge((byte) 27);
            student.setGender("女");
            student.setInfo("稻妻神里流太刀术皆传——神里陵华，参上!");

            int affectedRows = studentDao.insertStudent(student);

            System.out.println("受影响的行数："+affectedRows);

            session.commit();

            session.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    @Test
    public void testInsert()  {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Map<String,Object> map = new HashMap<>();
            map.put("name","雷电将军");
            map.put("age","29");
            map.put("gender","女");
            map.put("info","吃我奶香一刀");


            int affectedRows = studentDao.insert(map);

            System.out.println("受影响的行数："+affectedRows);

            session.commit();

            session.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void testFindByGenderAndName() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = studentDao.findByGenderAndName("男", "易烊千玺");

            System.out.println(student);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
