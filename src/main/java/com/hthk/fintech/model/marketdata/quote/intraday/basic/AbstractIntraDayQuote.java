package com.hthk.fintech.model.marketdata.quote.intraday.basic;

import com.hthk.fintech.model.marketdata.quote.basic.AbstractSnapshotQuote;

import java.time.LocalDateTime;

public abstract class AbstractIntraDayQuote extends AbstractSnapshotQuote {

    protected LocalDateTime dateTime;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
