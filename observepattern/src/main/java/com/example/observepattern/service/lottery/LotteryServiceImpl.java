package com.example.observepattern.service.lottery;

import com.example.observepattern.domain.LotteryResult;

import java.util.Date;

public class LotteryServiceImpl extends AbsLotteryService {

    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {
        String lottery = this.minibusTargetService.lottery(uId);
        LotteryResult lotteryResult = new LotteryResult(uId, lottery, new Date());

        return lotteryResult;
    }
}
