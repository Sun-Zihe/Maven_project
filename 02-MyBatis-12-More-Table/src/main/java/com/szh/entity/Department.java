package com.szh.entity;

import java.util.List;

public class Department {
    private int id ;
    private String name;
    //一对多关系，一个部门有多个员工
    private List<Employee> employees;
}
