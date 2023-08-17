package com.hthk.calypsox.model.marketdata.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "name", "type", "date", "time",
        "underlying", "quote"
})
public class FwdCurveCommodityCSVDTO {

    @CSVField(header = "name")
    private String name;

    @CSVField(header = "type")
    private String type;

    @CSVField(header = "date")
    private String date;

    @CSVField(header = "time")
    private String time;

    @CSVField(header = "underlying")
    private String underlying;

    @CSVField(header = "quote")
    private String quote;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUnderlying() {
        return underlying;
    }

    public void setUnderlying(String underlying) {
        this.underlying = underlying;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
