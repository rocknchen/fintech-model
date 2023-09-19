package com.hthk.calypsox.model.quote.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "date", "quoteName", "quoteType",
        "bid", "ask", "open", "close", "high", "low", "last",
        "enteredDate", "enteredUser",
        "sourceName", "version"
})
public class QuoteCalCSVDTO {

    @CSVField(header = "Date")
    private String date;

    @CSVField(header = "Quote Name")
    private String quoteName;

    @CSVField(header = "Quote Type")
    private String quoteType;

    @CSVField(header = "Bid")
    private String bid;

    @CSVField(header = "Ask")
    private String ask;

    @CSVField(header = "Open")
    private String open;

    @CSVField(header = "Close")
    private String close;

    @CSVField(header = "High")
    private String high;

    @CSVField(header = "Low")
    private String low;

    @CSVField(header = "Last")
    private String last;

    @CSVField(header = "Entered Date")
    private String enteredDate;

    @CSVField(header = "Entered User")
    private String enteredUser;

    @CSVField(header = "Source Name")
    private String sourceName;

    @CSVField(header = "Version")
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getQuoteName() {
        return quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEnteredDate() {
        return enteredDate;
    }

    public void setEnteredDate(String enteredDate) {
        this.enteredDate = enteredDate;
    }

    public String getEnteredUser() {
        return enteredUser;
    }

    public void setEnteredUser(String enteredUser) {
        this.enteredUser = enteredUser;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }
}