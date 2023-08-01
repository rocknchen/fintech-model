package com.hthk.fintech.model.event;

import java.time.LocalDateTime;

public class EventCriteria {

    private String domain;

    private LocalDateTime eventTime;

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
