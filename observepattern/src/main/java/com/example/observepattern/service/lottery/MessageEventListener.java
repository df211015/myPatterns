package com.example.observepattern.service.lottery;

import com.example.observepattern.domain.LotteryResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageEventListener implements EventListener {
    @Override
    public void doEvent(LotteryResult result) {
        String msg = String.format("给用户 %s 发送通知（短信）:%s", result.getUId(), result.getMsg());
        log.info(msg);
    }
}