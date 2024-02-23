package com.hthk.fintech.model.pricing;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

/**
 * @Author: Rock CHEN
 * @Date: 2024/2/23 14:55
 */
@FieldOrder({"tradeId", "pricingEnv", "valuationDate",
        "valuationTime", "measureName", "value",
        "errorMessage"})
public class TradePricingResultInfo {

    @CSVField(header = "tradeId")
    private String tradeId;

    @CSVField(header = "pricingEnv")
    private String pricingEnv;

    @CSVField(header = "valuationDate")
    private String valuationDate;

    @CSVField(header = "valuationTime")
    private String valuationTime;

    @CSVField(header = "measureName")
    private String measureName;

    @CSVField(header = "value")
    private String value;

    @CSVField(header = "errorMessage")
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getPricingEnv() {
        return pricingEnv;
    }

    public void setPricingEnv(String pricingEnv) {
        this.pricingEnv = pricingEnv;
    }

    public String getValuationDate() {
        return valuationDate;
    }

    public void setValuationDate(String valuationDate) {
        this.valuationDate = valuationDate;
    }

    public String getValuationTime() {
        return valuationTime;
    }

    public void setValuationTime(String valuationTime) {
        this.valuationTime = valuationTime;
    }

    public String getMeasureName() {
        return measureName;
    }

    public void setMeasureName(String measureName) {
        this.measureName = measureName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
