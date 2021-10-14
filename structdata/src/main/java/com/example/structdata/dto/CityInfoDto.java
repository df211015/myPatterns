package com.example.structdata.dto;

import lombok.Data;

@Data
public class CityInfoDto {
    private Integer index;
    private Integer code;
    private String name;
    private Double distance;
    private Double fee;
}
