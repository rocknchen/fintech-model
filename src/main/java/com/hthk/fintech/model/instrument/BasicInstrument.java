package com.hthk.fintech.model.instrument;

import com.hthk.fintech.enumration.BasicInstrumentGroupEnum;
import com.hthk.fintech.enumration.Instrument;
import com.hthk.fintech.model.instrument.basic.AbstractInstrument;

import static com.hthk.fintech.enumration.InstrumentGroup.BASIC;

@Instrument(group = BASIC)
public class BasicInstrument extends AbstractInstrument implements IBasicInstrument {

    private BasicInstrumentGroupEnum basicInstrumentGroup;

    @Override
    public BasicInstrumentGroupEnum getBasicInstrumentGroup() {
        return basicInstrumentGroup;
    }

    public void setBasicInstrumentGroup(BasicInstrumentGroupEnum basicInstrumentGroup) {
        this.basicInstrumentGroup = basicInstrumentGroup;
    }

}
