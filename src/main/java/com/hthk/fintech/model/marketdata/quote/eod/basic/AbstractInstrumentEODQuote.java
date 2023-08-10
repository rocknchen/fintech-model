package com.hthk.fintech.model.marketdata.quote.eod.basic;

import com.hthk.fintech.model.marketdata.quote.basic.AbstractInstrumentSnapshotQuote;

import java.time.LocalDate;

public abstract class AbstractInstrumentEODQuote extends AbstractInstrumentSnapshotQuote {

    protected LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
