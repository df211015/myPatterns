package com.example.service.mySpringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultiBeanConf {
    @Bean(value = "baseHello")
    HelloComponent baseHelloComponent() {
        return new HelloComponentImpl();
    }

    @Bean(name = "upperHello")
    HelloDecorator upperHelloDecorator(@Qualifier("baseHello") final HelloComponent helloComponent){
        return new UpperHelloDecorator(helloComponent);
    }

    @Bean(name = "lowerHello")
    HelloDecorator lowerHelloDecorator(@Qualifier("upperHello") final HelloComponent helloComponent){
        return new LowerHelloDecorator(helloComponent);
    }
}
