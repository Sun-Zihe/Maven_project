package com.szh.dao;

import com.szh.entity.Student;

import java.util.List;

public interface StudentDao {
    int getTotalCount();

    List<Student> getList(int pageNo, int pageSize);
}
