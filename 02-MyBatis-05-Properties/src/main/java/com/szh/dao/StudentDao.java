package com.szh.dao;

import com.szh.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();
}
