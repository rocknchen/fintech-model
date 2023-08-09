package com.hthk.fintech.model.instrument;

import com.hthk.fintech.enumration.SecurityCodeTypeEnum;

import java.util.Map;

public interface ISecurity extends IInstrument {

    Map<SecurityCodeTypeEnum, String> getSecurityCodeMap();

}
