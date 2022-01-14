package com.example.factorypattern.domain.dto;

import lombok.Data;

@Data
public abstract class Shape {
    /**
     * 等级
     */
    private String rank = "普通";

    private String remark;

    public abstract String getDescription();
}
