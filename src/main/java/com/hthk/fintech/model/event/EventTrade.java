package com.hthk.fintech.model.event;

import com.hthk.common.utils.CustomStringUtils;
import com.hthk.fintech.enumration.Event;
import com.hthk.fintech.enumration.EventSubTypeTradeEnum;
import com.hthk.fintech.enumration.EventTypeTradeEnum;
import com.hthk.fintech.model.event.basic.AbstractEvent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.hthk.fintech.config.FintechStaticData.DEFAULT_DATE_TIME_FORMAT;
import static com.hthk.fintech.enumration.EventGroupEnum.TRADE;

@Event(group = TRADE)
public class EventTrade extends AbstractEvent {

    private EventTypeTradeEnum type;

    private EventSubTypeTradeEnum subType;

    public EventTrade() {
    }

    public EventTrade(String id, String domain, EventTypeTradeEnum type, EventSubTypeTradeEnum subType, LocalDateTime time) {
        this.id = id;
        this.domain = domain;
        this.type = type;
        this.subType = subType;
        this.time = time;
    }

    public static EventTrade newInstance(String id, String domain, EventTypeTradeEnum type, EventSubTypeTradeEnum subType, LocalDateTime time) {
        return new EventTrade(id, domain, type, subType, time);
    }

    @Override
    public <R extends IEvent> R newInstance(String id, String domain, String typeStr, String subTypeStr, String timeStr) {
        return (R) new EventTrade(id, domain,
                CustomStringUtils.hasText(typeStr) ? EventTypeTradeEnum.valueOf(typeStr) : null,
                CustomStringUtils.hasText(subTypeStr) ? EventSubTypeTradeEnum.valueOf(subTypeStr) : null,
                LocalDateTime.parse(timeStr, DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_FORMAT)));
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
