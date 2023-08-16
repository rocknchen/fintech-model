package com.hthk.calypsox.model.staticdata.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "feed", "quoteType", "quoteAddress",
        "feedAddress", "scale", "spread",
        "bid", "ask", "high", "low", "open",
        "close", "low",
        "date"
})
public class FeedAddressCalCSVDTO {

    @CSVField(header = "Feed")
    private String feed;

    @CSVField(header = "Quote Type")
    private String quoteType;

    @CSVField(header = "Quote Address")
    private String quoteAddress;

    @CSVField(header = "Feed Address")
    private String feedAddress;

    @CSVField(header = "Scale")
    private String scale;

    @CSVField(header = "Spread")
    private String spread;

    @CSVField(header = "Bid")
    private String bid;

    @CSVField(header = "Ask")
    private String ask;

    @CSVField(header = "High")
    private String high;

    @CSVField(header = "Last")
    private String last;

    @CSVField(header = "Open")
    private String open;

    @CSVField(header = "Close")
    private String close;

    @CSVField(header = "Low")
    private String low;

    @CSVField(header = "Date")
    private String date;

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public String getQuoteAddress() {
        return quoteAddress;
    }

    public void setQuoteAddress(String quoteAddress) {
        this.quoteAddress = quoteAddress;
    }

    public String getFeedAddress() {
        return feedAddress;
    }

    public void setFeedAddress(String feedAddress) {
        this.feedAddress = feedAddress;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getSpread() {
        return spread;
    }

    public void setSpread(String spread) {
        this.spread = spread;
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

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
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

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
