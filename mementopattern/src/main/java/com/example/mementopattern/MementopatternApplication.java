package com.example.mementopattern;

import com.example.mementopattern.service.Caretaker;
import com.example.mementopattern.service.Originator;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MementopatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(MementopatternApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("启动成功");

		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());
		originator.restoreMemento(caretaker.getMemento());
	}
}
