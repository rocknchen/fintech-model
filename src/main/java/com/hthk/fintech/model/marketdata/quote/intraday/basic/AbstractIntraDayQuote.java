package com.hthk.fintech.model.marketdata.quote.intraday.basic;

import com.hthk.fintech.model.marketdata.quote.basic.AbstractSnapshotQuote;

import java.time.LocalDateTime;

public abstract class AbstractIntraDayQuote extends AbstractSnapshotQuote {

    protected LocalDateTime quoteDateTime;

    public LocalDateTime getQuoteDateTime() {
        return quoteDateTime;
    }

    public void setQuoteDateTime(LocalDateTime quoteDateTime) {
        this.quoteDateTime = quoteDateTime;
    }

}
