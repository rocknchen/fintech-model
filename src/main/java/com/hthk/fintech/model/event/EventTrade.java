package com.hthk.fintech.model.event;

import com.hthk.fintech.enumration.Event;
import com.hthk.fintech.enumration.EventSubTypeTradeEnum;
import com.hthk.fintech.enumration.EventTypeTradeEnum;
import com.hthk.fintech.model.event.basic.AbstractEvent;

import java.time.LocalDateTime;

import static com.hthk.fintech.enumration.EventGroupEnum.TRADE;

@Event(group = TRADE)
public class EventTrade extends AbstractEvent {

    private EventTypeTradeEnum type;

    private EventSubTypeTradeEnum subType;

    public EventTrade() {
    }

    public EventTrade(String domain, EventTypeTradeEnum type, EventSubTypeTradeEnum subType, LocalDateTime time) {
        this.domain = domain;
        this.type = type;
        this.subType = subType;
        this.time = time;
    }

    public static EventTrade newInstance(String domain, EventTypeTradeEnum type, EventSubTypeTradeEnum subType, LocalDateTime time) {
        return new EventTrade(domain, type, subType, time);
    }

    @Override
    public EventTypeTradeEnum getType() {
        return type;
    }

    @Override
    public EventSubTypeTradeEnum getSubType() {
        return subType;
    }

}
