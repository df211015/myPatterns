package com.example.facadepattern.service.v2.service.impl;

import com.example.facadepattern.service.v2.service.IPersonService;

/**
 * 门面模式,通过对象聚合的形式,可以有效的二次封装子系统相关类的属性、方法
 */
public class ChineseFacade implements IPersonService {
    private ChineseImpl chineseImpl;

    public ChineseFacade(ChineseImpl chineseImpl) {
        this.chineseImpl = chineseImpl;
    }

    @Override
    public void eat() {
        this.chineseImpl.eat();
    }
}
