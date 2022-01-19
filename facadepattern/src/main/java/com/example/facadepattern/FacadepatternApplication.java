package com.example.facadepattern;

import com.example.facadepattern.service.v2.service.impl.ChineseFacade;
import com.example.facadepattern.service.v2.service.impl.ChineseImpl;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadepatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(FacadepatternApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("启动成功");

//		ModenPostOffice modenPostOffice = new ModenPostOffice();
//		String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to....";
//		String address = "Happy Road No. 666,God Province,Heaven";
//		modenPostOffice.sendLetter(context, address);

		//在系统外部，你根本调用不到系统想要隐藏的属性和方法，只能调用公开的
		ChineseFacade cf = new ChineseFacade(new ChineseImpl());
		cf.eat();
	}
}
