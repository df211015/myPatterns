package com.example.service.pk3;

import com.example.domain.ERentType;

public class MyColleague_smallHouse extends AbsColleague {
    public MyColleague_smallHouse(AbsMediator mediator) {
        super(mediator);
    }

    @Override
    public void selfProcess() {
        System.out.println("MyColleague_smallHouse porcess!");
        super.getMediator().process(ERentType.Small_House);
    }

    @Override
    public void processOther() {
        System.out.println("处理其它");
    }
}
