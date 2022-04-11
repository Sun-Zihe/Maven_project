package com.szh.test;

import com.szh.dao.StudentDao;
import com.szh.entity.Student;
import com.szh.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class DynamicSQLTest {

    public void testFindAll() {
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        List<Student> students = studentDao.findAll();

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
