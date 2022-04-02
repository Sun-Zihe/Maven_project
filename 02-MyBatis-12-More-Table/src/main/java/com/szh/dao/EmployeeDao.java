package com.szh.dao;

import com.szh.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAll();
}
