package com.hthk.fintech.model.trade.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({"bookName", "counterParty", "productType", "productSubType",
        "tradeId", "externalReference", "internalReference", "buySell",
        "tradeDateTime", "updatedDateTime", "tradeStatus",
        "trader", "enteredUser", "enteredDateTime",
        "tradeVersion", "exerciseType", "settleType", "expiryDate", "optionExpiryCut",
        "currencyPair", "principalAmount", "callPut", "strike",
        "premiumCurrency", "premiumAmount", "premiumDate",
        "deliveryDate",
        "fxBaseCurrency", "fxBaseAmount", "fxBaseSettlementDate",
        "fxQuoteCurrency", "fxQuoteAmount", "fxQuoteSettlementDate"
})
public class TradeCSVDTO {

    @CSVField(header = "Book")
    private String bookName;

    @CSVField(header = "Counter Party")
    private String counterParty;

    @CSVField(header = "Product Type")
    private String productType;

    @CSVField(header = "Product Subtype")
    private String productSubType;

    @CSVField(header = "Trade Id")
    private String tradeId;

    @CSVField(header = "External Reference")
    private String externalReference;

    @CSVField(header = "Internal Reference")
    private String internalReference;

    @CSVField(header = "Buy Sell")
    private String buySell;

    @CSVField(header = "Trade Date Time")
    private String tradeDateTime;

    @CSVField(header = "Updated Date Time")
    private String updatedDateTime;

    @CSVField(header = "Trade Status")
    private String tradeStatus;

    @CSVField(header = "Trader")
    private String trader;

    @CSVField(header = "Entered User")
    private String enteredUser;

    @CSVField(header = "Entered Date Time")
    private String enteredDateTime;

    @CSVField(header = "Trade Version")
    private String tradeVersion;

    @CSVField(header = "Exercise Type")
    private String exerciseType;

    @CSVField(header = "Settle Type")
    private String settleType;

    @CSVField(header = "Expiry Date")
    private String expiryDate;

    @CSVField(header = "Option Expiry Cut")
    private String optionExpiryCut;

    @CSVField(header = "Currency Pair")
    private String currencyPair;

    @CSVField(header = "Principal Amount")
    private String principalAmount;

    @CSVField(header = "callPut")
    private String callPut;

    @CSVField(header = "strike")
    private String strike;

    @CSVField(header = "Premium Currency")
    private String premiumCurrency;

    @CSVField(header = "Premium Amount")
    private String premiumAmount;

    @CSVField(header = "Premium Date")
    private String premiumDate;

    @CSVField(header = "Delivery Date")
    private String deliveryDate;

    @CSVField(header = "FX Base Currency")
    private String fxBaseCurrency;

    @CSVField(header = "FX Base Amount")
    private String fxBaseAmount;

    @CSVField(header = "FX Base Settlement Date")
    private String fxBaseSettlementDate;

    @CSVField(header = "FX Quote Currency")
    private String fxQuoteCurrency;

    @CSVField(header = "FX Quote Amount")
    private String fxQuoteAmount;

    @CSVField(header = "FX Quote Settlement Date")
    private String fxQuoteSettlementDate;

    public String getPremiumCurrency() {
        return premiumCurrency;
    }

    public void setPremiumCurrency(String premiumCurrency) {
        this.premiumCurrency = premiumCurrency;
    }

    public String getBuySell() {
        return buySell;
    }

    public void setBuySell(String buySell) {
        this.buySell = buySell;
    }

    public String getTradeDateTime() {
        return tradeDateTime;
    }

    public void setTradeDateTime(String tradeDateTime) {
        this.tradeDateTime = tradeDateTime;
    }

    public String getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(String updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getTrader() {
        return trader;
    }

    public void setTrader(String trader) {
        this.trader = trader;
    }

    public String getEnteredUser() {
        return enteredUser;
    }

    public void setEnteredUser(String enteredUser) {
        this.enteredUser = enteredUser;
    }

    public String getEnteredDateTime() {
        return enteredDateTime;
    }

    public void setEnteredDateTime(String enteredDateTime) {
        this.enteredDateTime = enteredDateTime;
    }

    public String getTradeVersion() {
        return tradeVersion;
    }

    public void setTradeVersion(String tradeVersion) {
        this.tradeVersion = tradeVersion;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getOptionExpiryCut() {
        return optionExpiryCut;
    }

    public void setOptionExpiryCut(String optionExpiryCut) {
        this.optionExpiryCut = optionExpiryCut;
    }

    public String getCurrencyPair() {
        return currencyPair;
    }

    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }

    public String getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(String principalAmount) {
        this.principalAmount = principalAmount;
    }

    public String getCallPut() {
        return callPut;
    }

    public void setCallPut(String callPut) {
        this.callPut = callPut;
    }

    public String getStrike() {
        return strike;
    }

    public void setStrike(String strike) {
        this.strike = strike;
    }

    public String getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(String premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public String getPremiumDate() {
        return premiumDate;
    }

    public void setPremiumDate(String premiumDate) {
        this.premiumDate = premiumDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getCounterParty() {
        return counterParty;
    }

    public void setCounterParty(String counterParty) {
        this.counterParty = counterParty;
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

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    public String getInternalReference() {
        return internalReference;
    }

    public void setInternalReference(String internalReference) {
        this.internalReference = internalReference;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getFxBaseCurrency() {
        return fxBaseCurrency;
    }

    public void setFxBaseCurrency(String fxBaseCurrency) {
        this.fxBaseCurrency = fxBaseCurrency;
    }

    public String getFxBaseAmount() {
        return fxBaseAmount;
    }

    public void setFxBaseAmount(String fxBaseAmount) {
        this.fxBaseAmount = fxBaseAmount;
    }

    public String getFxBaseSettlementDate() {
        return fxBaseSettlementDate;
    }

    public void setFxBaseSettlementDate(String fxBaseSettlementDate) {
        this.fxBaseSettlementDate = fxBaseSettlementDate;
    }

    public String getFxQuoteCurrency() {
        return fxQuoteCurrency;
    }

    public void setFxQuoteCurrency(String fxQuoteCurrency) {
        this.fxQuoteCurrency = fxQuoteCurrency;
    }

    public String getFxQuoteAmount() {
        return fxQuoteAmount;
    }

    public void setFxQuoteAmount(String fxQuoteAmount) {
        this.fxQuoteAmount = fxQuoteAmount;
    }

    public String getFxQuoteSettlementDate() {
        return fxQuoteSettlementDate;
    }

    public void setFxQuoteSettlementDate(String fxQuoteSettlementDate) {
        this.fxQuoteSettlementDate = fxQuoteSettlementDate;
    }

}