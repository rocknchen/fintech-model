package com.hthk.fintech.model.event;

import com.hthk.fintech.enumration.*;
import com.hthk.fintech.model.event.basic.AbstractEvent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import static com.hthk.fintech.config.FintechStaticData.DEFAULT_DATE_TIME_FORMAT;
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
    public <R extends IEvent> R newInstance(String domain, String typeStr, String subTypeStr, String timeStr) {
        return (R) new EventMarketData(domain,
                Optional.ofNullable(typeStr).map(EventTypeMarketDataEnum::valueOf).orElse(null),
                Optional.ofNullable(subTypeStr).map(EventSubTypeMarketDataEnum::valueOf).orElse(null),
                LocalDateTime.parse(timeStr, DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_FORMAT)));
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
