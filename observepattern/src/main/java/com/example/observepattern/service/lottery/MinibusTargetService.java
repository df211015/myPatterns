package com.example.observepattern.service.lottery;

public class MinibusTargetService {
    /**
     * @param uId 用户编号
     * @return
     */
    public String lottery(String uId) {
        return Math.abs(uId.hashCode()) % 2 == 0 ? String.format("恭喜你，编码:%s,在本次摇号中签!", uId) :
                String.format("很遗憾，编码:%s，在本次摇号末中签或摇号资格已过期!", uId);
    }
}
