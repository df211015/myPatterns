package com.example.observepattern.service.lottery;

import com.example.observepattern.domain.LotteryResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MqEventListener implements EventListener {
    @Override
    public void doEvent(LotteryResult result) {
        String msg = String.format("记录用户 %s 摇号结果（MQ）:%s", result.getUId(), result.getMsg());
        log.info(msg);
    }
}