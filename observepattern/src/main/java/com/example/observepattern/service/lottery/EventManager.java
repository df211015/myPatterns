package com.example.observepattern.service.lottery;

import com.example.observepattern.domain.EventType;
import com.example.observepattern.domain.LotteryResult;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 主题
 */
@Slf4j
public class EventManager {
    private Map<Enum<EventType>, List<EventListener>> listeners = new HashMap<>();

    /**
     *
     * @param operations 不定入参的语法
     */
    public EventManager(Enum<EventType>... operations) {
        for (Enum<EventType> operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    /**
     * 订阅
     *
     * @param eventType
     * @param eventListener
     */
    public void subscribe(Enum<EventType> eventType, EventListener eventListener) {
        List<EventListener> users = this.listeners.get(eventType);
        users.add(eventListener);
    }

    /**
     * 取消订阅
     *
     * @param eventType
     * @param eventListener
     */
    public void unsubscribe(Enum<EventType> eventType, EventListener eventListener) {
        List<EventListener> users = this.listeners.get(eventType);
        users.remove(eventListener);
    }

    /**
     * 通知
     *
     * @param eventType
     * @param result
     */
    public void notify(Enum<EventType> eventType, LotteryResult result) {
        List<EventListener> users = this.listeners.get(eventType);
        for (EventListener listener : users) {
            listener.doEvent(result);
        }
    }
}