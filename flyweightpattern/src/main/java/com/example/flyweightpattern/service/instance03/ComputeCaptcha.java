package com.example.flyweightpattern.service.instance03;

public class ComputeCaptcha implements Captcha {

    /**
     * @param captchaArgs 外部状态，即变化的部分，通过参数传递，可以为对象或其它的参数。
     */
    @Override
    public void product(CaptchaArgs captchaArgs) {
        System.out.println("生成了一个宽度：" + captchaArgs.getWidth() + "，" +
                "高度：" + captchaArgs.getHeight() + ",复杂度:" + captchaArgs.getComplexity() + "的计算型验证码。");
    }
}