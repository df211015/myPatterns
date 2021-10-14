package com.example.demo100.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SimpleCarBasic {
    private int id;
    private String userName;
    private Integer age;
    private Date birthday;
    private Innercls2 innercls001;

    @Data
    public static class Innercls2{
        private String innerStr;
    }
}
