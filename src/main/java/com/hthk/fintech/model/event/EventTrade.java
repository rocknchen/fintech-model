package com.hthk.fintech.model.event;

import com.hthk.fintech.enumration.EventTypeTradeEnum;

import java.time.LocalDateTime;

public class EventTrade implements IEvent {

    private String domain;

    private EventTypeTradeEnum type;

    private LocalDateTime time;

    public EventTrade() {
    }

    public EventTrade(String domain, EventTypeTradeEnum type, LocalDateTime time) {
        this.domain = domain;
        this.type = type;
        this.time = time;
    }

    public static EventTrade newInstance(String domain, EventTypeTradeEnum type, LocalDateTime time) {
        return new EventTrade(domain, type, time);
    }

    public String getDomain() {
        return domain;
    }

    public EventTypeTradeEnum getType() {
        return type;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
