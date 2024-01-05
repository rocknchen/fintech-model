package com.hthk.fintech.model.trade;

import com.hthk.fintech.enumration.FieldOrder;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/5 16:31
 */
@FieldOrder({"book", "externalReference", "internalReference", "tradeId", "productType", "productSubType", "productExtType", "tradeDateTime", "settlementDate", "trader"})
public class TradeInfo {

    private String book;

    private String tradeId;

    private String externalReference;

    private String internalReference;

    private String productType;

    private String productSubType;

    private String productExtType;

    private LocalDateTime tradeDateTime;

    private LocalDate settlementDate;

    private String trader;

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
