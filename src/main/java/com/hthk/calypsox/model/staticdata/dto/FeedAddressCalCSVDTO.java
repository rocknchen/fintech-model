package com.hthk.calypsox.model.staticdata.dto;

import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "feed", "quoteType", "quoteAddress",
        "feedAddress", "scale", "spread",
        "bid", "ask", "high", "low", "open",
        "close", "low",
        "date"
})
public class FeedAddressCalCSVDTO {

    private String feed;

    private String quoteType;

    private String quoteAddress;

    private String feedAddress;

    private String scale;

    private String spread;

    private String bid;

    private String ask;

    private String high;

    private String last;

    private String open;

    private String close;

    private String low;

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
