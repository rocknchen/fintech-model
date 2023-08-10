package com.hthk.fintech.model.instrument.basic;

import com.hthk.fintech.enumration.SecurityCodeTypeEnum;
import com.hthk.fintech.model.instrument.IInstrument;

import java.util.Map;

public abstract class AbstractInstrument implements IInstrument {

    protected String name;

    protected Map<SecurityCodeTypeEnum, String> securityCodeMap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<SecurityCodeTypeEnum, String> getSecurityCodeMap() {
        return securityCodeMap;
    }

    public void setSecurityCodeMap(Map<SecurityCodeTypeEnum, String> securityCodeMap) {
        this.securityCodeMap = securityCodeMap;
    }
}
