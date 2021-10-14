package com.example.observepattern;

import com.example.observepattern.service.history.Hanfeizi;
import com.example.observepattern.service.history.Lisi;
import com.example.observepattern.service.history.Wangsi;
import com.example.observepattern.service.ring.MyRing;
import com.example.observepattern.service.ring.StudentA;
import com.example.observepattern.service.ring.StudentB;
import com.example.observepattern.service.ring.StudentC;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Observer;

@SpringBootApplication
public class ObservepatternApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ObservepatternApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		Observer lishi = new Lisi();
		Observer wangsi = new Wangsi();

		Hanfeizi hanfeizi = new Hanfeizi();
		hanfeizi.addObserver(lishi);
		hanfeizi.addObserver(wangsi);
		hanfeizi.doSomething();

		Observer studentA = new StudentA();
		Observer studentB = new StudentB();
		Observer studentC = new StudentC();

		MyRing myRing = new MyRing();
		myRing.addObserver(studentA);
		myRing.addObserver(studentB);
		myRing.addObserver(studentC);

		StudentA studentA1 = (StudentA)studentA;
		studentA1.addObserver(studentB);
		studentA1.addObserver(studentC);
		studentA1.doSomething();

		myRing.playRing();
	}
}
