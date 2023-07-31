package com.hthk.fintech.model.event;

import com.hthk.common.utils.CustomStringUtils;
import com.hthk.fintech.enumration.Event;
import com.hthk.fintech.enumration.EventSubTypeMarketDataEnum;
import com.hthk.fintech.enumration.EventTypeMarketDataEnum;
import com.hthk.fintech.model.event.basic.AbstractEvent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
                CustomStringUtils.hasText(typeStr) ? EventTypeMarketDataEnum.valueOf(typeStr) : null,
                CustomStringUtils.hasText(subTypeStr) ? EventSubTypeMarketDataEnum.valueOf(subTypeStr) : null,
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
