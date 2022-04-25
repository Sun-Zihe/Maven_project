package com.fc.controller;

import com.fc.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    //当有多个同一个类对象的bean时可以使用@Qualifier来指定名字。
    @Qualifier("car2")
    private Car car;

    @RequestMapping("getCar")
    public Car getCar() {
        return car;
    }
}
