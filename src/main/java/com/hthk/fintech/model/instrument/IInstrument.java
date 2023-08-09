package com.hthk.fintech.model.instrument;

import com.hthk.fintech.enumration.InstrumentGroup;

public interface IInstrument {

    InstrumentGroup getInstrumentGroup();

    String getName();

}
