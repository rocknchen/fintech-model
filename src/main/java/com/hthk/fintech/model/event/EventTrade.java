package com.hthk.fintech.model.event;

import com.hthk.fintech.enumration.EventGroupEnum;
import com.hthk.fintech.enumration.EventSubTypeTradeEnum;
import com.hthk.fintech.enumration.EventTypeTradeEnum;

import java.time.LocalDateTime;

public class EventTrade implements IEvent {

    private String domain;

    private EventGroupEnum group;

    private EventTypeTradeEnum type;

    private EventSubTypeTradeEnum subType;

    private LocalDateTime time;

    public EventTrade() {
    }

    public EventTrade(String domain, EventGroupEnum group, EventTypeTradeEnum type, EventSubTypeTradeEnum subType, LocalDateTime time) {
        this.domain = domain;
        this.group = group;
        this.type = type;
        this.subType = subType;
        this.time = time;
    }

    public static EventTrade newInstance(String domain, EventGroupEnum group, EventTypeTradeEnum type, EventSubTypeTradeEnum subType, LocalDateTime time) {
        return new EventTrade(domain, group, type, subType, time);
    }

    public String getDomain() {
        return domain;
    }

    @Override
    public EventGroupEnum getGroup() {
        return group;
    }

    public EventTypeTradeEnum getType() {
        return type;
    }

    @Override
    public EventSubTypeTradeEnum getSubType() {
        return subType;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
