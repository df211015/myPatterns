package com.example.voicereport.dto;

import lombok.Data;

@Data
public class DispatchTask {
    //时
    private Integer hour;
    //分
    private Integer minute;
    //播报内容
    private String content;
}
