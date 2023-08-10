package com.hthk.fintech.model.instrument;

import com.hthk.fintech.enumration.BasicInstrumentGroupEnum;

public interface IBasicInstrument extends IInstrument {

    BasicInstrumentGroupEnum getBasicInstrumentGroup();

}
