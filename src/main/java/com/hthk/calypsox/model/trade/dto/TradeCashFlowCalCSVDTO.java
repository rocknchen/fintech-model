package com.hthk.calypsox.model.trade.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "tradeId", "productKey",
        "settlementType", "payRec", "currency",
        "amount", "date"
})
public class TradeCashFlowCalCSVDTO {

    @CSVField(header = "Trade Id")
    private String tradeId;

    @CSVField(header = "Product Key")
    private String productKey;

    @CSVField(header = "Settlement Type")
    private String settlementType;

    @CSVField(header = "Pay Rec")
    private String payRec;

    @CSVField(header = "Currency")
    private String currency;

    @CSVField(header = "Amount")
    private String amount;

    @CSVField(header = "Date")
    private String date;

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }

    public String getPayRec() {
        return payRec;
    }

    public void setPayRec(String payRec) {
        this.payRec = payRec;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
