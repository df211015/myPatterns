package com.example.demo100.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CarBasicVo {
    private Integer id;
    private String userName;
    private Integer age;
    private Date birthday;

    private Double money;
    private String desc;
    private Innercls1 innercls001;

    @Data
    public static class Innercls1{
        private String innerStr;
    }
}
