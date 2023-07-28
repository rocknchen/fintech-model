package com.hthk.fintech.model.event;

import com.hthk.fintech.enumration.*;
import com.hthk.fintech.model.event.basic.AbstractEvent;

import java.time.LocalDateTime;

import static com.hthk.fintech.enumration.EventGroupEnum.MARKET_DATA;

@Event(group = MARKET_DATA)
public class EventMarketData extends AbstractEvent {

    private EventTypeMarketDataEnum type;

    private EventSubTypeMarketDataEnum subType;

    public EventMarketData() {
    }

    public EventMarketData(String domain, EventTypeMarketDataEnum type, EventSubTypeMarketDataEnum subType, LocalDateTime time) {
        this.domain = domain;
        this.type = type;
        this.subType = subType;
        this.time = time;
    }

    public static EventMarketData newInstance(String domain, EventTypeMarketDataEnum type, EventSubTypeMarketDataEnum subType, LocalDateTime time) {
        return new EventMarketData(domain, type, subType, time);
    }

    @Override
    public EventTypeMarketDataEnum getType() {
        return type;
    }

    @Override
    public EventSubTypeMarketDataEnum getSubType() {
        return subType;
    }

}
