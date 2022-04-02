package com.szh.entity;

public class Student {
    private Integer id;
    private String name;
    private Byte age;

    public Student(){
        System.out.println("无参构造");
    }

    public void init(){
        System.out.println("初始化");
    }
    public void destroy(){
        System.out.println("销毁S");
    }
}


