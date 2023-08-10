package com.hthk.fintech.model.instrument;

import com.hthk.fintech.enumration.Instrument;
import com.hthk.fintech.enumration.SecurityGroupEnum;
import com.hthk.fintech.model.instrument.basic.AbstractInstrument;

import static com.hthk.fintech.enumration.InstrumentGroup.SECURITY;

@Instrument(group = SECURITY)
public class Security extends AbstractInstrument implements ISecurity {

    private SecurityGroupEnum securityGroup;

    @Override
    public SecurityGroupEnum getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(SecurityGroupEnum securityGroup) {
        this.securityGroup = securityGroup;
    }

}
