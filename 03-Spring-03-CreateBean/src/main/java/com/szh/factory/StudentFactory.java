package com.szh.factory;

import com.szh.entity.Student;

public class StudentFactory {
    public Student getStudent(){
        return new Student();
    }
}
