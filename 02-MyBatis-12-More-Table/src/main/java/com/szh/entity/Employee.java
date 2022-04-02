package com.szh.entity;

import lombok.Data;

import java.util.List;

@Data
public class Employee {
    private Integer id;
    private String name;
    // 一对一，一个员工对应一个部门
    private Department department1;
}
