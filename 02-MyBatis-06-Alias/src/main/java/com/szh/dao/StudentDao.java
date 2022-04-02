package com.szh.dao;

import com.szh.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();
    List findByName(String name);
    Student findById (Integer id);
    List<Student> findByAge (Byte age);
    List<Student> findByGender(String gender);
}
