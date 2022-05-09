package com.example.observepattern.service.lottery;

import com.example.observepattern.domain.LotteryResult;

public interface EventListener {
    void doEvent(LotteryResult result);
}