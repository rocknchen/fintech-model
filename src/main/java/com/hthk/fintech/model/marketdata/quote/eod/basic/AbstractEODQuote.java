package com.hthk.fintech.model.marketdata.quote.eod.basic;

import com.hthk.fintech.model.marketdata.quote.basic.AbstractSnapshotQuote;

import java.time.LocalDate;

public abstract class AbstractEODQuote extends AbstractSnapshotQuote {

    protected LocalDate quoteDate;

    public LocalDate getQuoteDate() {
        return quoteDate;
    }

    public void setQuoteDate(LocalDate quoteDate) {
        this.quoteDate = quoteDate;
    }

}
