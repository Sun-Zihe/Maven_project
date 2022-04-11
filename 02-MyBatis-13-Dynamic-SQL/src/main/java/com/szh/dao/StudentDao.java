package com.szh.dao;

import com.szh.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();

    //模糊查询
    List<Student> findByKeyword(@Param("name") String name, @Param("age") Integer age);
}
