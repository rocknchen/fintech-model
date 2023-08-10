package com.hthk.fintech.model.marketdata.quote.basic;

import com.hthk.fintech.model.entity.basic.AbstractEntity;
import com.hthk.fintech.model.instrument.IInstrument;
import com.hthk.fintech.model.quote.IQuote;

public abstract class AbstractSnapshotQuote<I extends IInstrument, Q extends IQuote>

        extends AbstractEntity {

    protected I instrument;

    protected Q quote;

    public I getInstrument() {
        return instrument;
    }

    public void setInstrument(I instrument) {
        this.instrument = instrument;
    }

    public Q getQuote() {
        return quote;
    }

    public void setQuote(Q quote) {
        this.quote = quote;
    }
}
