package com.example.structdata.service;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Configuration
@EnableScheduling
public class MyTestTask {
    private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedDelay = 1000)
    public void executeUpdateYqTask() {
        System.out.println(Thread.currentThread().getName() + " >>> task one " + format.format(new Date()));
    }

    @Scheduled(fixedDelay = 1000)
    public void executeRepaymentTask() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " >>> task two " + format.format(new Date()));
        Thread.sleep(5000);
    }

}
