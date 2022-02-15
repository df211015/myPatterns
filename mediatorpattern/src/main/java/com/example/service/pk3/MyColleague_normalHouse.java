package com.example.service.pk3;

import com.example.domain.ERentType;

public class MyColleague_normalHouse extends AbsColleague {
    public MyColleague_normalHouse(AbsMediator mediator) {
        super(mediator);
    }

    @Override
    public void selfProcess() {
        System.out.println("MyColleague_normalHouse porcess!");
        super.getMediator().process(ERentType.Normal_House);
    }

    @Override
    public void processOther() {
        System.out.println("normalHouse,其它处理!");
    }
}
