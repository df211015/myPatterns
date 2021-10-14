package dd;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Demo {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Demo.class);
        application.setBannerMode(Banner.Mode.LOG);
        application.setWebEnvironment(true);
        application.run(args);
        log.info("hello");
    }
}
