package com.hthk.fintech.model.quote;

import java.math.BigDecimal;

public interface IInstrumentQuote extends IQuote {

    BigDecimal getClose();

}
