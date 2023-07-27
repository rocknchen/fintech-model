package com.hthk.fintech.model.event;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.EventGroupEnum;
import com.hthk.fintech.enumration.FieldOrder;

import java.time.LocalDateTime;

@FieldOrder({"domain", "time", "group", "type", "subType"})
public interface IEvent {

    @CSVField(header = "Domain")
    String getDomain();

    @CSVField(header = "Group")
    EventGroupEnum getGroup();

    @CSVField(header = "Type")
    Enum<?> getType();

    @CSVField(header = "SubType")
    Enum<?> getSubType();

    @CSVField(header = "Time")
    LocalDateTime getTime();

}
