package com.hthk.calypsox.model.pricing.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "tradeId",
        "valuationDateTime",
        "pricingEnv",
        "PV", "TV"
})
public class PricingCalCSVDTO {

    @CSVField(header = "Trade Id")
    private String tradeId;

    @CSVField(header = "Valuation Date Time")
    private String valuationDateTime;

    @CSVField(header = "Pricing Env")
    private String pricingEnv;

    @CSVField(header = "PV")
    private String pv;

    @CSVField(header = "TV")
    private String tv;

    public String getValuationDateTime() {
        return valuationDateTime;
    }

    public void setValuationDateTime(String valuationDateTime) {
        this.valuationDateTime = valuationDateTime;
    }

    public String getPricingEnv() {
        return pricingEnv;
    }

    public void setPricingEnv(String pricingEnv) {
        this.pricingEnv = pricingEnv;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }
}
