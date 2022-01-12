package com.example.factorypattern.domain.dto;

import lombok.Data;

@Data
public class Rect extends Shape {
    //长
    private Integer width;
    //宽
    private Integer length;

    @Override
    public String getDescription() {
        return "长方形物体";
    }
}
