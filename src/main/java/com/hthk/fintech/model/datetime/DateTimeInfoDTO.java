package com.hthk.fintech.model.datetime;

import com.hthk.fintech.enumration.DateTimeFormatEnum;

import java.util.Map;

public class DateTimeInfoDTO {

    Map<DateTimeFormatEnum, String> dataMap;

    public DateTimeInfoDTO(Map<DateTimeFormatEnum, String> dataMap) {
        this.dataMap = dataMap;
    }

    public Map<DateTimeFormatEnum, String> getDataMap() {
        return dataMap;
    }
}
