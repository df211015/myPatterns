package com.example.builderpattern.service.builder01;

public class ChildSuperManBuilder extends Builder {

    @Override
    public SuperMan getSuperMan() {
        super.setBody("强壮的躯体");
        super.setSpectialTalent("刀枪不入");
        super.setSpecialSymbol("胸前带小S标识");

        return super.superMan;
    }
}
