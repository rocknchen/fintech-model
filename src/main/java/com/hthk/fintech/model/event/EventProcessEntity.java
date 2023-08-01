package com.hthk.fintech.model.event;

import com.hthk.fintech.converter.impl.AttLocalDateTimeConverter;
import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.CSVModel;
import com.hthk.fintech.enumration.EventProcessStatusEnum;
import com.hthk.fintech.enumration.FieldOrder;
import com.hthk.fintech.serialize.impl.EventProcessEntityDeserializeController;

import java.time.LocalDateTime;

@FieldOrder({"name", "id", "eventId", "status", "updatedDateTime"})
@CSVModel(deserializeController = EventProcessEntityDeserializeController.class)
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

    @CSVField(header = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @CSVField(header = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @CSVField(header = "event id")
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @CSVField(header = "status")
    public EventProcessStatusEnum getStatus() {
        return status;
    }

    public void setStatus(EventProcessStatusEnum status) {
        this.status = status;
    }

    @CSVField(header = "updated date time", converter = AttLocalDateTimeConverter.class)
    public LocalDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }
}
