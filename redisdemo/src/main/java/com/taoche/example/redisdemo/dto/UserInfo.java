package com.taoche.example.redisdemo.dto;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;

@Data
public class UserInfo implements Serializable {
    private String id;
    private String userName;
    private Integer age;
    private String remark;
}
