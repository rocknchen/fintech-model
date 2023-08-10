package com.hthk.fintech.model.instrument;

import com.hthk.fintech.enumration.SecurityGroupEnum;

public interface ISecurity extends IInstrument {

    SecurityGroupEnum getSecurityGroup();

}
