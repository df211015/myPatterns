package com.example.observepattern.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LotteryResult {
    private String uId;
    private String msg;
    private Date date;
}