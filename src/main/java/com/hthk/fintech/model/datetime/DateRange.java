package com.hthk.fintech.model.datetime;

import java.time.LocalDate;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/5 14:25
 */
public class DateRange {

    private LocalDate start;

    private LocalDate end;

    private boolean includeStart = true;

    private boolean includeEnd = true;

    public DateRange(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DateRange() {
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public boolean isIncludeStart() {
        return includeStart;
    }

    public void setIncludeStart(boolean includeStart) {
        this.includeStart = includeStart;
    }

    public boolean isIncludeEnd() {
        return includeEnd;
    }

    public void setIncludeEnd(boolean includeEnd) {
        this.includeEnd = includeEnd;
    }
}
