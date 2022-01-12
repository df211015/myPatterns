package com.example.factorypattern.domain.dto;

import lombok.Data;

@Data
public class Triangle extends Shape {
    private Integer firstLine;
    private Integer secondLine;
    private Integer thirdLine;

    @Override
    public String getDescription() {
        return "三角形";
    }
}
