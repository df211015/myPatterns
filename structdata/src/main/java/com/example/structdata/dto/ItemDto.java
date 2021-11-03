package com.example.structdata.dto;

import lombok.Data;

@Data
public class ItemDto {
    private String id;
    private String name;
    private String remark;
    private ItemDto next;
}