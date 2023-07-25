package com.hthk.fintech.model.event;

import com.hthk.fintech.enumration.EventTypeTradeEnum;

import java.time.LocalDateTime;

public class EventTrade implements IEvent {

    private String domain;

    private EventTypeTradeEnum type;

    private LocalDateTime dateTime;

    public EventTrade() {
    }

    public EventTrade(String domain, EventTypeTradeEnum type, LocalDateTime dateTime) {
        this.domain = domain;
        this.type = type;
        this.dateTime = dateTime;
    }

    public String getDomain() {
        return domain;
    }

    public EventTypeTradeEnum getType() {
        return type;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
