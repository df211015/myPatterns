package com.example.statepattern.service.AutowisedTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyTest {
    private MyTest1 myTest1;

    private MyTest2 myTest2;

    public MyTest(){
        System.out.println("初始化无参建造函数");
    }

    @Autowired
    public MyTest(MyTest1 myTest1, MyTest2 myTest2){
        this.myTest1 = myTest1;
        this.myTest2 = myTest2;
        System.out.println("初始化有参构建函数");
    }

    public String getMyTest(){
        if(null != this.myTest1 && null != this.myTest2) {
            String format = String.format("%s-%s", this.myTest1.getMyVar1(), this.myTest2.getMyVar2());
            return format;
        }
        return "dddddddd";
    }
}
