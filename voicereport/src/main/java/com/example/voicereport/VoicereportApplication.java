package com.example.voicereport;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  智能小喇叭
 *  作者:liudengfeng
 *  Email:251334456@qq.com
 *  2020.05.05
 */
@Slf4j
@SpringBootApplication
public class VoicereportApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(VoicereportApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("【智能小喇叭V1.0】启动成功");
    }
}
