package com.hthk.fintech.model.event;

import com.hthk.fintech.enumration.EventProcessStatusEnum;

import java.time.LocalDateTime;

public class EventProcessEntity {

    private String name;

    private String id;

    private String eventId;

    private EventProcessStatusEnum status;

    private LocalDateTime updatedDateTime;

    public EventProcessEntity() {
    }

    public EventProcessEntity(String name, String eventId, EventProcessStatusEnum status, LocalDateTime updatedDateTime) {
        this.name = name;
        this.eventId = eventId;
        this.status = status;
        this.updatedDateTime = updatedDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public EventProcessStatusEnum getStatus() {
        return status;
    }

    public void setStatus(EventProcessStatusEnum status) {
        this.status = status;
    }

    public LocalDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }
}
