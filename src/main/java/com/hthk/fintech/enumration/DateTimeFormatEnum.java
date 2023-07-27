package com.hthk.fintech.enumration;

import org.apache.commons.collections.map.HashedMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public enum DateTimeFormatEnum {

    YYYYMM("yyyyMM");

    String format;

    DateTimeFormatEnum(String format) {
        this.format = format;
    }

    public static Map<String, DateTimeFormatEnum> getFormatMap() {

        Map<String, DateTimeFormatEnum> formatMap = new HashedMap();
        List<DateTimeFormatEnum> formatList = Arrays.stream(values()).collect(Collectors.toList());
        formatList.forEach(t -> formatMap.put(t.format, t));
        return formatMap;
    }

    public String getFormat() {
        return format;
    }

}
