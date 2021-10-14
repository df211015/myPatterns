package com.example.hutoolmytest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private long termId;//学期id
    private long classId;//班级id
    private long studentId;//班级id
    private String name;//学生名称
}