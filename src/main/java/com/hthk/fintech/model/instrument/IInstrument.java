package com.hthk.fintech.model.instrument;

import com.hthk.fintech.enumration.Instrument;
import com.hthk.fintech.enumration.InstrumentGroup;
import com.hthk.fintech.enumration.SecurityCodeTypeEnum;

import java.util.Map;

public interface IInstrument {

    default InstrumentGroup getInstrumentGroup() {
        return this.getClass().getAnnotation(Instrument.class).group();
    }

    String getName();

    Map<SecurityCodeTypeEnum, String> getSecurityCodeMap();

}
