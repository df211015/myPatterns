package com.example.voicereport.config;


import com.example.voicereport.service.MyQuartz;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  智能小喇叭
 *  作者:liudengfeng
 *  Email:251334456@qq.com
 *  2020.05.05
 */
@Configuration
public class QuartzConfig {
    @Autowired
    private MyJobConfig myJobConfig;

    @Bean
    public JobDetail quartzDetail() {
        return JobBuilder.newJob(MyQuartz.class)
                .withIdentity(this.myJobConfig.getJobname())
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger quartzTrigger() {
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(this.myJobConfig.getJobinterval())
                .repeatForever();
        return TriggerBuilder.newTrigger().forJob(quartzDetail())
                .withIdentity(this.myJobConfig.getJobname())
                .withSchedule(scheduleBuilder).build();
    }
}
