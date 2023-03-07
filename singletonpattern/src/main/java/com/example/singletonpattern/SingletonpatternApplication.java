package com.example.singletonpattern;

import com.example.singletonpattern.service.simple.SingletonPlus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SingletonpatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SingletonpatternApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("启动成功!");

		SingletonPlus singletonPlus = SingletonPlus.getSingletonPlus();
		log.info(String.format("singletonPlus:%s",singletonPlus.getString()));
	}
}
