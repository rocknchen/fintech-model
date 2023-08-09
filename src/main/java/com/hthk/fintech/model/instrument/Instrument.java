package com.hthk.fintech.model.instrument;

import com.hthk.fintech.enumration.InstrumentGroup;

public class Instrument implements IInstrument {

    private InstrumentGroup instrumentGroup;

    private String name;

    @Override
    public InstrumentGroup getInstrumentGroup() {
        return instrumentGroup;
    }

    public void setInstrumentGroup(InstrumentGroup instrumentGroup) {
        this.instrumentGroup = instrumentGroup;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
