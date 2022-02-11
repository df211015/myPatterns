package com.example.service.pk3;

import com.example.domain.ERentType;

import java.util.HashMap;
import java.util.Map;

/**
 * 抽象中
 */
public abstract class AbsMediator {
    public Map<ERentType, AbsColleague> getMapColleague() {
        return mapColleague;
    }

    private Map<ERentType, AbsColleague> mapColleague = new HashMap<>();

    /**
     * 注册同事类
     *
     * @param colleague
     */
    public void regist(AbsColleague colleague, ERentType rentType) {
        if (!this.mapColleague.keySet().contains(rentType)) {
            this.mapColleague.put(rentType, colleague);
        }
    }

    public abstract void process();
}