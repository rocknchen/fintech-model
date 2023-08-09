package com.hthk.fintech.model.marketdata.quote.eod.basic;

import java.time.LocalDate;

public abstract class AbstractEODQuote extends AbstractQuote {

    protected LocalDate quoteDate;

    public LocalDate getQuoteDate() {
        return quoteDate;
    }

    public void setQuoteDate(LocalDate quoteDate) {
        this.quoteDate = quoteDate;
    }
}
