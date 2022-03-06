package com.szh.dao;

import com.szh.entity.Student;

import java.util.List;

public interface StudentDao {
    Student findById();

    List<Student> findAll();

    Student findStudentById(Integer id);
}
