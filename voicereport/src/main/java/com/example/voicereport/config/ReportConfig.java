package com.example.voicereport.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 *  智能小喇叭
 *  作者:liudengfeng
 *  Email:251334456@qq.com
 *  2020.05.05
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "spring.reportsetting")
public class ReportConfig {
    /**
     * 一条播报记录中间的间隔时间,单位:毫秒
     */
    private Integer reportInterval;

    /**
     * 一条播报记录中的重复次数
     */
    private Integer reportRepeat;

    /**
     * 语音报告记录前缀模板
     */
    private String reportPrefixtemplate;

    /**
     * 标准监控时间减去指定分钟
     */
    private Integer reportSubminute;
}