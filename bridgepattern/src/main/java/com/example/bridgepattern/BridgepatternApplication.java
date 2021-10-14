package com.example.bridgepattern;

import com.example.bridgepattern.filminfo.AbstractStar;
import com.example.bridgepattern.filminfo.ActFilm;
import com.example.bridgepattern.filminfo.FilmStar;
import com.example.bridgepattern.filminfo.Singer;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgepatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(BridgepatternApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
//		HouseCorp houseCorp = new HouseCorp(new House());
//		houseCorp.makeMoney();
//
//		ShanZhaiCorp shanZaiCorp = new ShanZhaiCorp(new IPod());
//		shanZaiCorp.makeMoney();

		AbstractStar filmStar = new FilmStar();
		filmStar.doJob();

		AbstractStar singer = new Singer();
		singer.doJob();

		AbstractStar singerExt = new Singer(new ActFilm());
		singerExt.doJob();
	}
}
