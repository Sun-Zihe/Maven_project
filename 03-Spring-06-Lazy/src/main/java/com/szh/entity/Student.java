package com.szh.entity;

public class Student {
    private Integer id;
    private String name;
    private Byte age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

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


