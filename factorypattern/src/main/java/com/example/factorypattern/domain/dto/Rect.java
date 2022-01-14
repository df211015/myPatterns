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
        return String.format("%s长方形", super.getRank());
    }
}
