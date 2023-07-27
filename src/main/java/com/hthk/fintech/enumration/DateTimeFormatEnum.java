package com.hthk.fintech.enumration;

public enum DateTimeFormatEnum {

    YYYYMM("yyyyMM"), YYYYMMDD("yyyyMMdd");

    String format;

    DateTimeFormatEnum(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

}
