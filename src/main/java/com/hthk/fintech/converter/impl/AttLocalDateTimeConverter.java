package com.hthk.fintech.converter.impl;

import com.hthk.fintech.converter.AttributeStringConverter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import static com.hthk.fintech.config.FintechStaticData.DEFAULT_DATE_TIME_FORMAT;

public class AttLocalDateTimeConverter implements AttributeStringConverter<LocalDateTime> {

    @Override
    public String process(LocalDateTime input) {
        return Optional.ofNullable(input).map(t -> t.format(DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_FORMAT))).orElse(null);
    }

}
