package com.dfliu.performancemonitor.controller;

import com.dfliu.performancemonitor.domain.vo.UserVo;
import com.dfliu.performancemonitor.service.impl.Metrics;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
public class UserController {
    private Metrics metrics = new Metrics();

    public UserController() {
        this.metrics.startRepeatedReport(60, TimeUnit.SECONDS);
    }

    public void register(UserVo user) {
        long startTimestamp = System.currentTimeMillis();
        this.metrics.recordTimestamp("regsiter", startTimestamp);
        //...
        long respTime = System.currentTimeMillis() - startTimestamp;
        this.metrics.recordResponseTime("register", respTime);
    }

    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();
        this.metrics.recordTimestamp("login", startTimestamp);
        //...
        long respTime = System.currentTimeMillis() - startTimestamp;
        this.metrics.recordResponseTime("login", respTime);

        return null;
    }
}
