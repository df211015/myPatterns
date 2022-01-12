package com.example.factorypattern.domain.dto;

import lombok.Data;

@Data
public class Circle extends Shape {
    //直径
    private Integer diameter;

    @Override
    public String getDescription() {
        return "圆形";
    }
}
