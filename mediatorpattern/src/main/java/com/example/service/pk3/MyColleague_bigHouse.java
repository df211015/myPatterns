package com.example.service.pk3;

import com.example.domain.ERentType;

public class MyColleague_bigHouse extends AbsColleague {
    public MyColleague_bigHouse(AbsMediator mediator) {
        super(mediator);
    }

    @Override
    public void selfProcess() {
        System.out.println("MyColleague_bigHouse porcess!");
        super.getMediator().process(ERentType.Big_House);
    }

    @Override
    public void processOther() {
        System.out.println("bigHouse,其它处理!");
    }
}
