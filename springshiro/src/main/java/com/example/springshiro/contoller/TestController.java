package com.example.springshiro.contoller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    /**
     * 测试web请求
     * @return String
     */
    @RequestMapping(value = "/mytest")
    public String test(){
        log.info("test请求");
        return "hello world";
    }
}
