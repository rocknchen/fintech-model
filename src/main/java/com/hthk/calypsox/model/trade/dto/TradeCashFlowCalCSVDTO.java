package com.hthk.calypsox.model.trade.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "book", "productType", "productSubType",
        "origTradeId", "tradeId", "tradeKeywordTradeIdLink",
        "payRec", "settlementDate", "settlementType", "fixedFloat",
        "fixedRate",
        "rateIndex", "rateIndexTenor", "spread",
        "currency", "notional",
        "fwdRate", "df",
        "amount", "settlementAmount", "projectedAmount"
})
public class TradeCashFlowCalCSVDTO {

    @CSVField(header = "Book")
    private String book;

    @CSVField(header = "Product Type")
    private String productType;

    @CSVField(header = "Product Sub Type")
    private String productSubType;

    @CSVField(header = "Fixed or Floating")
    private String fixedFloat;

    @CSVField(header = "Fixed Rate")
    private String fixedRate;

    @CSVField(header = "Rate Index")
    private String rateIndex;

    @CSVField(header = "Rate Index Tenor")
    private String rateIndexTenor;

    @CSVField(header = "Spread")
    private String spread;

    @CSVField(header = "Orig Trade Id")
    private String origTradeId;

    @CSVField(header = "Trade Id")
    private String tradeId;

    @CSVField(header = "Trade Keyword TRADE_ID_LINK")
    private String tradeKeywordTradeIdLink;

    @CSVField(header = "Settlement Type")
    private String settlementType;

    @CSVField(header = "Pay Rec")
    private String payRec;

    @CSVField(header = "Currency")
    private String currency;

    @CSVField(header = "Notional")
    private String notional;

    @CSVField(header = "Forward Rate")
    private String fwdRate;

    @CSVField(header = "Discount Factor")
    private String df;

    @CSVField(header = "PV")
    private String pv;

    @CSVField(header = "Amount")
    private String amount;

    @CSVField(header = "Settlement Amount")
    private String settlementAmount;

    @CSVField(header = "Projected Amount")
    private String projectedAmount;

    @CSVField(header = "Settlement Date")
    private String settlementDate;

    public String getNotional() {
        return notional;
    }

    public void setNotional(String notional) {
        this.notional = notional;
    }

    public String getFwdRate() {
        return fwdRate;
    }

    public void setFwdRate(String fwdRate) {
        this.fwdRate = fwdRate;
    }

    public String getDf() {
        return df;
    }

    public void setDf(String df) {
        this.df = df;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public String getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(String settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public String getProjectedAmount() {
        return projectedAmount;
    }

    public void setProjectedAmount(String projectedAmount) {
        this.projectedAmount = projectedAmount;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductSubType() {
        return productSubType;
    }

    public void setProductSubType(String productSubType) {
        this.productSubType = productSubType;
    }

    public String getFixedFloat() {
        return fixedFloat;
    }

    public void setFixedFloat(String fixedFloat) {
        this.fixedFloat = fixedFloat;
    }

    public String getFixedRate() {
        return fixedRate;
    }

    public void setFixedRate(String fixedRate) {
        this.fixedRate = fixedRate;
    }

    public String getRateIndex() {
        return rateIndex;
    }

    public void setRateIndex(String rateIndex) {
        this.rateIndex = rateIndex;
    }

    public String getRateIndexTenor() {
        return rateIndexTenor;
    }

    public void setRateIndexTenor(String rateIndexTenor) {
        this.rateIndexTenor = rateIndexTenor;
    }

    public String getSpread() {
        return spread;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public String getOrigTradeId() {
        return origTradeId;
    }

    public void setOrigTradeId(String origTradeId) {
        this.origTradeId = origTradeId;
    }

    public String getTradeKeywordTradeIdLink() {
        return tradeKeywordTradeIdLink;
    }

    public void setTradeKeywordTradeIdLink(String tradeKeywordTradeIdLink) {
        this.tradeKeywordTradeIdLink = tradeKeywordTradeIdLink;
    }


    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
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

    public String getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
    }
}
