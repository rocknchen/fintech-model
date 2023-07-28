package com.hthk.fintech.model.event;

import com.hthk.fintech.converter.impl.AttLocalDateTimeConverter;
import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.CSVModel;
import com.hthk.fintech.enumration.EventGroupEnum;
import com.hthk.fintech.enumration.FieldOrder;
import com.hthk.fintech.serialize.impl.IEventDeserializeController;

import java.time.LocalDateTime;

@FieldOrder({"domain", "group", "type", "subType", "time"})
@CSVModel(deserializeController = IEventDeserializeController.class)
public interface IEvent {

    @CSVField(header = "Domain")
    String getDomain();

    @CSVField(header = "Group")
    EventGroupEnum getGroup();

    @CSVField(header = "Type")
    Enum<?> getType();

    @CSVField(header = "SubType")
    Enum<?> getSubType();

    @CSVField(header = "Time", converter = AttLocalDateTimeConverter.class)
    LocalDateTime getTime();

}
