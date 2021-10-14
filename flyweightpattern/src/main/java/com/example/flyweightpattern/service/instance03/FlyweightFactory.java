package com.example.flyweightpattern.service.instance03;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FlyweightFactory {
    /**
     * 享元角色的缓存，key是验证码的类型,都是单例的
     */
    private Map<Integer, Captcha> captchaMap = new ConcurrentHashMap<>();

    /**
     * 初始化时，先添加好其需要共享的享元角色
     */
    public FlyweightFactory() {
        //0 表示正常验证码
        this.captchaMap.put(0, new NormalCaptcha());
        //1 表示输入型验证码
        this.captchaMap.put(1, new ComputeCaptcha());
    }

    /**
     * 享元模式的获取，只返回缓存中的，做到共享。
     *
     * @param type 类型，0是正常验证码。1是计算型验证码
     * @return 验证码类
     */
    public Captcha getCaptcha(int type) {
        if (this.captchaMap.keySet().contains(type)) {
            return this.captchaMap.get(type);
        } else {
            return null;
        }
    }
}
