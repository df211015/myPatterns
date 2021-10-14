package com.example.voicereport.service;

import lombok.extern.slf4j.Slf4j;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  智能小喇叭
 *  作者:liudengfeng
 *  Email:251334456@qq.com
 *  2020.05.05
 */
@Slf4j
@Service(value = "MyQuartzBean")
@DisallowConcurrentExecution
public class MyQuartz extends QuartzJobBean {
    @Autowired
    private IDispatchTask dispatchTask;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("==========================================");
        Date fireTime = jobExecutionContext.getFireTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        log.info(String.format("监控时间服务开始,监控时间点:%s......" ,simpleDateFormat.format(fireTime)));
        this.dispatchTask.process(fireTime);
    }
}
