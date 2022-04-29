package com.fc.dao;

import com.fc.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao {
    List<Student> findAll();
}
