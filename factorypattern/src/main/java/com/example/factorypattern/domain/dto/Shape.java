package com.example.factorypattern.domain.dto;

import lombok.Data;

@Data
public abstract class Shape {
    private String remark;

    public abstract String getDescription();
}
