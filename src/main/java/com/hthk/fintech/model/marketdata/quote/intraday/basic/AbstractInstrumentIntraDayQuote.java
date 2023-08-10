package com.hthk.fintech.model.marketdata.quote.intraday.basic;

import com.hthk.fintech.model.marketdata.quote.basic.AbstractInstrumentSnapshotQuote;

import java.time.LocalDateTime;

public abstract class AbstractInstrumentIntraDayQuote extends AbstractInstrumentSnapshotQuote {

    protected LocalDateTime dateTime;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
