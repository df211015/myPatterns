package com.example.statepattern.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
@EnableConfigurationProperties(ThreadConfig.class)
public class ExecutorServiceConfig {
    private final ThreadConfig threadConfig;

    public ExecutorServiceConfig(ThreadConfig threadConfig){
        this.threadConfig = threadConfig;
    }

    @Bean("newExecutorPool")
    public ExecutorService newExecutorPool(){
        return new ThreadPoolExecutor(this.threadConfig.getCorePoolSize(),
                this.threadConfig.getMaximumPoolSize(),
                this.threadConfig.getKeepAliveTime(),
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
    }
}
