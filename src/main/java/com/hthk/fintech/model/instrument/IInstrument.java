package com.hthk.fintech.model.instrument;

import com.hthk.fintech.enumration.Instrument;
import com.hthk.fintech.enumration.InstrumentGroupEnum;
import com.hthk.fintech.enumration.SecurityCodeTypeEnum;

import java.util.Map;

public interface IInstrument {

    default InstrumentGroupEnum getInstrumentGroup() {
        return this.getClass().getAnnotation(Instrument.class).group();
    }

    String getName();

    Map<SecurityCodeTypeEnum, String> getSecurityCodeMap();

}
