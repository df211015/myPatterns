package com.example.flyweightpattern.service.instance03;

public interface Captcha {
    /**
     * 享元角色的公共接口
     * @param captchaArgs 外部状态，即变化的部分，通过参数传递，可以为对象或其它的参数。
     */
    void product(CaptchaArgs captchaArgs);
}