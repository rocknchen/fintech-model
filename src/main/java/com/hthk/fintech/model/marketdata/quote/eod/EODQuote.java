package com.hthk.fintech.model.marketdata.quote.eod;

import com.hthk.fintech.model.marketdata.quote.eod.basic.AbstractEODQuote;

import java.math.BigDecimal;

public class EODQuote extends AbstractEODQuote {

    private BigDecimal close;

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

}
