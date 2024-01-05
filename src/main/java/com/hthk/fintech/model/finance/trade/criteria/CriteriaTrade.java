package com.hthk.fintech.model.finance.trade.criteria;

import com.hthk.fintech.model.common.Criteria;

import java.time.LocalDate;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.TRADE;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.COUNT;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.GET;

/**
 * @Author: Rock CHEN
 * @Date: 2023/12/22 17:14
 */
@Criteria(actions = {GET, COUNT}, type = TRADE)
public class CriteriaTrade {

    private LocalDate tradeDate;

    public LocalDate getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(LocalDate tradeDate) {
        this.tradeDate = tradeDate;
    }

}
