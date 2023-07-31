package com.hthk.fintech.model.event;

import com.hthk.fintech.converter.impl.AttLocalDateTimeConverter;
import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.CSVModel;
import com.hthk.fintech.enumration.EventGroupEnum;
import com.hthk.fintech.enumration.FieldOrder;
import com.hthk.fintech.serialize.impl.IEventDeserializeController;

import java.time.LocalDateTime;

@FieldOrder({"id", "domain", "group", "type", "subType", "supplementary1", "supplementary2", "supplementary3", "time"})
@CSVModel(deserializeController = IEventDeserializeController.class)
public interface IEvent {

    @CSVField(header = "id")
    String getId();

    @CSVField(header = "Domain")
    String getDomain();

    @CSVField(header = "Group")
    EventGroupEnum getGroup();

    @CSVField(header = "Type")
    Enum<?> getType();

    @CSVField(header = "SubType")
    Enum<?> getSubType();

    @CSVField(header = "Supplementary_1")
    default String getSupplementary1() {
        return null;
    }

    @CSVField(header = "Supplementary_2")
    default String getSupplementary2() {
        return null;
    }

    @CSVField(header = "Supplementary_3")
    default String getSupplementary3() {
        return null;
    }

    @CSVField(header = "Time", converter = AttLocalDateTimeConverter.class)
    LocalDateTime getTime();

}
