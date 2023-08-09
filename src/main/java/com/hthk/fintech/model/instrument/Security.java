package com.hthk.fintech.model.instrument;

import com.hthk.fintech.enumration.SecurityCodeTypeEnum;

import java.util.Map;

public class Security extends Instrument implements ISecurity {

    private Map<SecurityCodeTypeEnum, String> securityCodeMap;

    public void setSecurityCodeMap(Map<SecurityCodeTypeEnum, String> securityCodeMap) {
        this.securityCodeMap = securityCodeMap;
    }

    @Override
    public Map<SecurityCodeTypeEnum, String> getSecurityCodeMap() {
        return null;
    }

}
