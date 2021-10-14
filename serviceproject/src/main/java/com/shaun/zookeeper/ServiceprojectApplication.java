package com.shaun.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.shaun.*")
@ServletComponentScan
public class ServiceprojectApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceprojectApplication.class, args);
	}
}
