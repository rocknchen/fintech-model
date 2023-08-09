package com.hthk.fintech.model.marketdata.quote.basic;

import com.hthk.fintech.model.instrument.IInstrument;

public abstract class AbstractSnapshotQuote<I extends IInstrument> {

    protected I instrument;

    public I getInstrument() {
        return instrument;
    }

    public void setInstrument(I instrument) {
        this.instrument = instrument;
    }
    
}
