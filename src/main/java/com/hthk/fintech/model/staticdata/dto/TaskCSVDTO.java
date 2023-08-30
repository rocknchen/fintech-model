package com.hthk.fintech.model.staticdata.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({"externalReference", "tradeFilter",
        "pricingEnv", "timeZone",
        "valuationTime",
        "valuationDateOffset", "businessHolidays",
        "attributes"
})
public class TaskCSVDTO {

    @CSVField(header = "External Reference")
    private String externalReference;

    @CSVField(header = "Trade Filter")
    private String tradeFilter;

    @CSVField(header = "Pricing Environment")
    private String pricingEnv;

    @CSVField(header = "Time Zone")
    private String timeZone;

    @CSVField(header = "Val Time")
    private String valuationTime;

    @CSVField(header = "Date Offset")
    private String valuationDateOffset;

    @CSVField(header = "Business Holidays")
    private String businessHolidays;

    @CSVField(header = "Task Attributes")
    private String attributes;

    public String getPricingEnv() {
        return pricingEnv;
    }

    public void setPricingEnv(String pricingEnv) {
        this.pricingEnv = pricingEnv;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    public String getTradeFilter() {
        return tradeFilter;
    }

    public void setTradeFilter(String tradeFilter) {
        this.tradeFilter = tradeFilter;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getValuationTime() {
        return valuationTime;
    }

    public void setValuationTime(String valuationTime) {
        this.valuationTime = valuationTime;
    }

    public String getValuationDateOffset() {
        return valuationDateOffset;
    }

    public void setValuationDateOffset(String valuationDateOffset) {
        this.valuationDateOffset = valuationDateOffset;
    }

    public String getBusinessHolidays() {
        return businessHolidays;
    }

    public void setBusinessHolidays(String businessHolidays) {
        this.businessHolidays = businessHolidays;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }
}
