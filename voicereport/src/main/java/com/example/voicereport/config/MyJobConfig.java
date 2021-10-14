package com.example.voicereport.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *  智能小喇叭
 *  作者:liudengfeng
 *  Email:251334456@qq.com
 *  2020.05.05
 */
@Data
@Component
@ConfigurationProperties(prefix = "myjob.setting")
public class MyJobConfig {
    private String jobname;
    private Integer jobinterval;
}