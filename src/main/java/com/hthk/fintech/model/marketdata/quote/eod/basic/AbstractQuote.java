package com.hthk.fintech.model.marketdata.quote.eod.basic;

import com.hthk.fintech.model.instrument.IInstrument;

public abstract class AbstractQuote {

    protected IInstrument instrument;

    public IInstrument getInstrument() {
        return instrument;
    }

    public void setInstrument(IInstrument instrument) {
        this.instrument = instrument;
    }
}
