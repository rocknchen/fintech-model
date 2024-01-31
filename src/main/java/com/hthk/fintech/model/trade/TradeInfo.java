package com.hthk.fintech.model.trade;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/5 16:31
 */
@FieldOrder({"book", "counterParty", "tradeId",
        "externalReference", "internalReference", "productType",
        "productSubType", "productExtType", "tradeDateTime",
        "settlementDate", "buySell", "price",
        "quantity", "tradeStatus", "trader",
        "enteredUser", "enteredDateTime", "futureUnderlyingTickerExchange",
        "futureUnderlyingBBTickerExchange"})
public class TradeInfo {

    @CSVField(header = "book")
    private String book;

    @CSVField(header = "counterParty")
    private String counterParty;

    @CSVField(header = "tradeId")
    private String tradeId;

    @CSVField(header = "externalReference")
    private String externalReference;

    @CSVField(header = "internalReference")
    private String internalReference;

    @CSVField(header = "productType")
    private String productType;

    @CSVField(header = "productSubType")
    private String productSubType;

    @CSVField(header = "productExtType")
    private String productExtType;

    @CSVField(header = "tradeDateTime")
    private LocalDateTime tradeDateTime;

    @CSVField(header = "settlementDate")
    private LocalDate settlementDate;

    @CSVField(header = "buySell")
    private String buySell;

    @CSVField(header = "price")
    private BigDecimal price;

    @CSVField(header = "quantity")
    private String quantity;

    @CSVField(header = "tradeStatus")
    private String tradeStatus;

    @CSVField(header = "trader")
    private String trader;

    @CSVField(header = "enteredUser")
    private String enteredUser;

    @CSVField(header = "enteredDateTime")
    private LocalDateTime enteredDateTime;

    /**
     * FutureFX
     */
    @CSVField(header = "futureUnderlyingTickerExchange")
    private String futureUnderlyingTickerExchange;

    @CSVField(header = "futureUnderlyingBBTickerExchange")
    private String futureUnderlyingBBTickerExchange;

    public String getCounterParty() {
        return counterParty;
    }

    public void setCounterParty(String counterParty) {
        this.counterParty = counterParty;
    }

    public String getBuySell() {
        return buySell;
    }

    public void setBuySell(String buySell) {
        this.buySell = buySell;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getEnteredUser() {
        return enteredUser;
    }

    public void setEnteredUser(String enteredUser) {
        this.enteredUser = enteredUser;
    }

    public LocalDateTime getEnteredDateTime() {
        return enteredDateTime;
    }

    public void setEnteredDateTime(LocalDateTime enteredDateTime) {
        this.enteredDateTime = enteredDateTime;
    }

    public String getFutureUnderlyingBBTickerExchange() {
        return futureUnderlyingBBTickerExchange;
    }

    public void setFutureUnderlyingBBTickerExchange(String futureUnderlyingBBTickerExchange) {
        this.futureUnderlyingBBTickerExchange = futureUnderlyingBBTickerExchange;
    }

    public String getFutureUnderlyingTickerExchange() {
        return futureUnderlyingTickerExchange;
    }

    public void setFutureUnderlyingTickerExchange(String futureUnderlyingTickerExchange) {
        this.futureUnderlyingTickerExchange = futureUnderlyingTickerExchange;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
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

    public String getProductExtType() {
        return productExtType;
    }

    public void setProductExtType(String productExtType) {
        this.productExtType = productExtType;
    }

    public LocalDate getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(LocalDate settlementDate) {
        this.settlementDate = settlementDate;
    }

    public String getTrader() {
        return trader;
    }

    public void setTrader(String trader) {
        this.trader = trader;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public LocalDateTime getTradeDateTime() {
        return tradeDateTime;
    }

    public void setTradeDateTime(LocalDateTime tradeDateTime) {
        this.tradeDateTime = tradeDateTime;
    }
}
