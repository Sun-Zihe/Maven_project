package com.szh.dao;

import com.szh.entity.Student;

import java.util.List;

public interface StudentDao {

    //查询小于指定年零的学生
    List<Student> findByLessThanAge(Integer age);

    //查询 大玉指定的年龄的学生
    List <Student> findGreaterThanAge(Integer sge);

}
