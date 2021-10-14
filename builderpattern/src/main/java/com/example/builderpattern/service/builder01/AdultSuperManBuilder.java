package com.example.builderpattern.service.builder01;

public class AdultSuperManBuilder extends Builder {
    @Override
    public SuperMan getSuperMan() {
        super.setBody("强壮的躯体");
        super.setSpectialTalent("会飞行");
        super.setSpecialSymbol("胸前带S标识");
        return super.superMan;
    }
}
