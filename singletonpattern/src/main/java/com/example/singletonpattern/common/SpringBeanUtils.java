package com.example.singletonpattern.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanUtils implements ApplicationContextAware {
    private static ApplicationContext appContext;

    public static <T> T getBean(Class<T> type) {
        return appContext.getBean(type);
    }

    public static <T> T getBean(String beanName) {
        return (T)appContext.getBean(beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        appContext = applicationContext;
    }
}
