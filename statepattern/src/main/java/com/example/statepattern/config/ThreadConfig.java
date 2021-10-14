package com.example.statepattern.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "spring.thread")
public class ThreadConfig {
    private Integer corePoolSize;
    private Integer maximumPoolSize;
    private Long keepAliveTime;
}
