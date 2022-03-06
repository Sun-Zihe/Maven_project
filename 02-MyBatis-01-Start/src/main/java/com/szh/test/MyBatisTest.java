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
import java.util.List;

public class MyBatisTest {

    @Test
    public void testFindStudentById() {
        try {

        //读取配置文件到流中
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        //构建会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获取链接
        SqlSession sqlSession = factory.openSession();

        //获取接口的实现类
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);

        Student student = studentDao.findStudentById(5);
        System.out.println(student);
        sqlSession.commit();
        sqlSession.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testFindAll()  {
        //读取文件，获取流
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            //构建工厂
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            //获取链接
            SqlSession session = factory.openSession();

            //获取接口实现类
            StudentDao studentDao = session.getMapper(StudentDao.class);

            List<Student> students = studentDao.findAll();

            for (Student student: students
                 ) {
                System.out.println(student);
            }

            //提交事务
            session.commit();

            //关闭资源
            session.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public  void testInterface(){
        //读取配置文件
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            //构建会话工厂
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);

            //获取链接
            SqlSession session = build.openSession();

            //通过反射获取接口的实现类
            StudentDao mapper = session.getMapper(StudentDao.class);

            Student student = mapper.findById();

            System.out.println(student);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testInsert(){
        //读取配置文件到流中
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            //构建SqlSession工厂
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            //生产SqlSession->QueryRunner->Connection
            SqlSession session = factory.openSession();

            //执行sql语句获取受影响的行数
            int affectedRows = session.insert("com.szh.dao.StudentDao.insert");

            System.out.println("受影响的行数："+affectedRows);

            //提交事物
            session.commit();
            //关闭资源
            session.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void test(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
