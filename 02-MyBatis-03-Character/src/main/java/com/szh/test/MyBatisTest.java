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
    public void testGreaterThan(){
    try {
        //将 配置文件输入到流中
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //构建会话工厂
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        //打开会话资源
        SqlSession session = build.openSession();
        //将接口映射到会话中
        StudentDao studentDao = session.getMapper(StudentDao.class);
        //使用已经 映射 到会话中的接口方法，并使用list集合来接收
        List<Student> students = studentDao.findGreaterThanAge(30);
        for (Student student: students
             ) {
            System.out.println();
        }

        session.commit();
        session.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

}
    @Test
    public void testLessThan() {
        // 读取配置文件
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            // 构建会话工厂
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            // 获取会话连接
            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            List<Student> students = studentDao.findByLessThanAge(30);

            for (Student student : students) {
                System.out.println(student);
            }

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
