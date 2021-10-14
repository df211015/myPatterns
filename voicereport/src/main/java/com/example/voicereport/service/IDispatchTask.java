package com.example.voicereport.service;

import com.example.voicereport.dto.DispatchTask;

import java.util.Date;
import java.util.List;

/**
 *  智能小喇叭
 *  作者:liudengfeng
 *  Email:251334456@qq.com
 *  2020.05.05
 */
public interface IDispatchTask {
    List<DispatchTask> getData();

    void process(Date date);
}
