package com.hthk.fintech.model.finance.quote;

import com.hthk.fintech.model.common.Criteria;

import java.time.LocalDate;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.EOD_QUOTE;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.GET;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/2 16:22
 */
@Criteria(action = GET, type = EOD_QUOTE)
public class CriteriaGetEODQuote {

    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
