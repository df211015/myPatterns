package com.example.observepattern.service.lottery;

import com.example.observepattern.domain.EventType;
import com.example.observepattern.domain.LotteryResult;

public abstract class AbsLotteryService {
    private EventManager eventManager;

    public AbsLotteryService() {
        this.eventManager = new EventManager(EventType.MQ, EventType.Message);
        eventManager.subscribe(EventType.MQ, new MqEventListener());
        eventManager.subscribe(EventType.Message, new MessageEventListener());
    }

    public LotteryResult draw(String uId) {
        LotteryResult lotteryResult = this.doDraw(uId);
        this.eventManager.notify(EventType.MQ, lotteryResult);
        this.eventManager.notify(EventType.Message, lotteryResult);
        return lotteryResult;
    }

    /**
     * 触发观察者事件
     * @param uId
     * @return
     */
    protected abstract LotteryResult doDraw(String uId);
}
