package com.szh.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    // Field、Method、Constructor、Inner Class
    private Integer id;
    private String name;
    private Byte age;
    private String gender;
    private String info;
}
