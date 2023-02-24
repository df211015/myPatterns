package com.example.strategypattern;

import com.example.strategypattern.service.simple.ConcreteStrategy1;
import com.example.strategypattern.service.simple.Context;
import com.example.strategypattern.service.simple.Strategy;
import com.example.strategypattern.service.v1.BackDoor;
import com.example.strategypattern.service.v1.BlockEnemy;
import com.example.strategypattern.service.v1.GivenGreenLight;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategypatternApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(StrategypatternApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Context context;
		System.out.println("---刚到吴国的时候拆第一个---");
		context = new Context(new BackDoor());
		context.operate();
		System.out.println("");

		System.out.println("---刘备乐不思蜀了,拆第二个---");
		context = new Context(new GivenGreenLight());
		context.operate();
		System.out.println("");

		System.out.println("---孙权的小兵追来了,咋办?拆第三个---");
		context = new Context(new BlockEnemy());
		context.operate();
		System.out.println("");*/

		/**
		 * 策略模式处理demo示例
		 */
		Strategy strategy = new ConcreteStrategy1();
		Context context = new Context();
		context.setStrategy(strategy);
		context.processOfStrategy();
	}
}
