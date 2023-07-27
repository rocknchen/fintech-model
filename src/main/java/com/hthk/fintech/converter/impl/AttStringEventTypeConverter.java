package com.hthk.fintech.converter.impl;

import com.hthk.fintech.converter.AttributeStringConverter;
import com.hthk.fintech.enumration.EventTypeTradeEnum;

public class AttStringEventTypeConverter implements AttributeStringConverter<EventTypeTradeEnum> {

    @Override
    public String process(EventTypeTradeEnum input) {
        return AttributeStringConverter.super.process(input);
    }

}
