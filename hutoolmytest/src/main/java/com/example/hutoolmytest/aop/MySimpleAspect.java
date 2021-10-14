package com.example.hutoolmytest.aop;

import cn.hutool.aop.aspects.SimpleAspect;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

@Service
public class MySimpleAspect extends SimpleAspect {
    @Override
    public boolean after(Object target, Method method, Object[] args, Object returnVal) {
        System.out.println("执行结束");
        return super.after(target, method, args, returnVal);
    }

    @Override
    public boolean before(Object target, Method method, Object[] args) {
        String formatMsg = String.format("执行前,入参为:%s", JSON.toJSONString(args));
        System.out.println(formatMsg);
        return super.before(target, method, args);
    }
}
