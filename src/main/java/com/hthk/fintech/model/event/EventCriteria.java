package com.hthk.fintech.model.event;

import java.time.LocalDateTime;

public class EventCriteria {

    private LocalDateTime eventTime;

    public LocalDateTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalDateTime eventTime) {
        this.eventTime = eventTime;
    }
}
