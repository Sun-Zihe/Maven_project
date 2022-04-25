package com.fc.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
//将这个类注入到容器中
@Component
public class Car {
    private String brand="小骑车";
}
