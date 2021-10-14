package com.example.structdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ProcessFactory {

    @Autowired
    private IProcess process;

    private static IProcess interProcess;

    @PostConstruct
    public void myInit() {
        interProcess = process;
    }

    /**
     * 静态方法里使用自动注入的对象
     */
    public static void getMyProcess() {
        if (null != interProcess) {
            interProcess.process();
        } else {
            System.out.println("process未被初始化!");
        }
    }
}
