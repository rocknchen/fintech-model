package com.hthk.fintech.model.event;

import com.hthk.fintech.enumration.EventGroupEnum;

import java.time.LocalDateTime;

public class EventCriteria {

    private String domain;

    private EventGroupEnum group;

    private LocalDateTime eventTime;

    public EventGroupEnum getGroup() {
        return group;
    }

    public void setGroup(EventGroupEnum group) {
        this.group = group;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public LocalDateTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalDateTime eventTime) {
        this.eventTime = eventTime;
    }
}
