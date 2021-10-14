package com.example.springshiro;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(scanBasePackages = {"com.example.springshiro.*"})
@MapperScan("com.example.springshiro.dao")
public class SpringshiroApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringshiroApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.setWebApplicationType(WebApplicationType.SERVLET);
		application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("SpringshiroApplication启动成功");
	}
}
