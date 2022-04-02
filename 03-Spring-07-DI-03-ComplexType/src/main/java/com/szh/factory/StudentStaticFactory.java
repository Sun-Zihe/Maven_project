package com.szh.factory;

import com.szh.entity.Student;

public class StudentStaticFactory {
    public static Student getStudent(){
        return new Student();
    }
}
