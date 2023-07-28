package com.hthk.fintech.model.event.basic;

import com.hthk.fintech.enumration.Event;
import com.hthk.fintech.enumration.EventGroupEnum;
import com.hthk.fintech.model.event.IEvent;

import java.time.LocalDateTime;

public abstract class AbstractEvent implements IEvent {

    protected String domain;

    protected LocalDateTime time;

    public abstract <R extends IEvent> R newInstance(String domain, String typeStr, String subTypeStr, String timeStr);

    public final EventGroupEnum getGroup() {
        return this.getClass().getAnnotation(Event.class).group();
    }

    public String getDomain() {
        return domain;
    }

    public LocalDateTime getTime() {
        return time;
    }

}
