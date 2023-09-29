package com.hthk.calypsox.model.trade.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "book", "productType", "productSubType",
        "origTradeId", "tradeId", "tradeKeywordTradeIdLink",
        "tradeKeywordLiborBackup",
        "tradeStatus",
        "payRec", "settlementType", "cashFlowType", "paymentFrequency",
        "fixedFloat", "resetDate", "settlementDate",
        "rateIndex", "rateIndexTenor", "spread",
        "currency", "notional",
        "rate", "fixedRate", "resetRate", "fwdRate",
        "amount", "settlementAmount", "projectedAmount",
        "df", "pv",
        "settleDateReconStatus",
        "futureSettleDateReconStatus"
})
public class TradeCashFlowCalCSVDTO {

    @CSVField(header = "Book")
    private String book;

    @CSVField(header = "Product Type")
    private String productType;

    @CSVField(header = "Product Sub Type")
    private String productSubType;

    @CSVField(header = "Cash Flow Type")
    private String cashFlowType;

    @CSVField(header = "Payment Frequency")
    private String paymentFrequency;

    @CSVField(header = "Libor Reform Recon.Settle Date")
    private String settleDateReconStatus;

    @CSVField(header = "Libor Reform Recon.Future Settle Date")
    private String futureSettleDateReconStatus;

    public String getFutureSettleDateReconStatus() {
        return futureSettleDateReconStatus;
    }

    public void setFutureSettleDateReconStatus(String futureSettleDateReconStatus) {
        this.futureSettleDateReconStatus = futureSettleDateReconStatus;
    }

    @CSVField(header = "Reset Date")
    private String resetDate;

    @CSVField(header = "Fixed or Floating")
    private String fixedFloat;

    @CSVField(header = "Fixed Rate")
    private String fixedRate;

    @CSVField(header = "Trade Status")
    private String tradeStatus;

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

    @CSVField(header = "Rate")
    private String rate;

    @CSVField(header = "Reset Rate")
    private String resetRate;

    @CSVField(header = "Trade Keyword TRADE_ID_LINK")
    private String tradeKeywordTradeIdLink;

    @CSVField(header = "Trade Keyword LIBOR_BACKUP")
    private String tradeKeywordLiborBackup;

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

    public String getTradeKeywordLiborBackup() {
        return tradeKeywordLiborBackup;
    }

    public void setTradeKeywordLiborBackup(String tradeKeywordLiborBackup) {
        this.tradeKeywordLiborBackup = tradeKeywordLiborBackup;
    }

    public String getPaymentFrequency() {
        return paymentFrequency;
    }

    public void setPaymentFrequency(String paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
    }

    public String getSettleDateReconStatus() {
        return settleDateReconStatus;
    }

    public void setSettleDateReconStatus(String settleDateReconStatus) {
        this.settleDateReconStatus = settleDateReconStatus;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getResetRate() {
        return resetRate;
    }

    public void setResetRate(String resetRate) {
        this.resetRate = resetRate;
    }

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

    public String getCashFlowType() {
        return cashFlowType;
    }

    public void setCashFlowType(String cashFlowType) {
        this.cashFlowType = cashFlowType;
    }

    public String getResetDate() {
        return resetDate;
    }

    public void setResetDate(String resetDate) {
        this.resetDate = resetDate;
    }
}
