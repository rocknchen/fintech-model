package com.hthk.fintech.serialize.impl;

import com.hthk.fintech.enumration.EventProcessStatusEnum;
import com.hthk.fintech.exception.DeserializeException;
import com.hthk.fintech.model.event.EventProcessEntity;
import com.hthk.fintech.serialize.ModelDeserializeController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static com.hthk.fintech.config.FintechStaticData.DEFAULT_DATE_TIME_FORMAT;

public class EventProcessEntityDeserializeController implements ModelDeserializeController<EventProcessEntity> {

    @Override
    public EventProcessEntity process(List<String> headerList, List<String> fieldList) throws DeserializeException {

        EventProcessEntity model = new EventProcessEntity();

        String name = fieldList.get(0);
        String id = fieldList.get(1);
        String eventId = fieldList.get(2);
        String status = fieldList.get(3);
        String updateDateTime = fieldList.get(4);

        model.setName(name);
        model.setId(id);
        model.setEventId(eventId);
        model.setStatus(EventProcessStatusEnum.valueOf(status));
        model.setUpdatedDateTime(LocalDateTime.parse(updateDateTime, DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_FORMAT)));

        return model;
    }

}
