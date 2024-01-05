package com.hthk.fintech.model.finance.quote;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.datetime.DateRange;

import java.time.LocalDate;
import java.util.List;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.EOD_QUOTE;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.COUNT;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.GET;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/2 16:22
 */
@Criteria(actions = {GET, COUNT}, type = EOD_QUOTE)
public class CriteriaEODQuote {

    private LocalDate date;

    private DateRange dateRange;

    private List<LocalDate> dateList;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public DateRange getDateRange() {
        return dateRange;
    }

    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    public List<LocalDate> getDateList() {
        return dateList;
    }

    public void setDateList(List<LocalDate> dateList) {
        this.dateList = dateList;
    }
}
