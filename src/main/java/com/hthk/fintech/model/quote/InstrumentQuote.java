package com.hthk.fintech.model.quote;

import com.hthk.fintech.enumration.QuoteTypeEnum;

import java.math.BigDecimal;

public class InstrumentQuote implements IInstrumentQuote {

    protected QuoteTypeEnum quoteType;

    protected BigDecimal close;

    @Override
    public QuoteTypeEnum getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(QuoteTypeEnum quoteType) {
        this.quoteType = quoteType;
    }

    @Override
    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

}
