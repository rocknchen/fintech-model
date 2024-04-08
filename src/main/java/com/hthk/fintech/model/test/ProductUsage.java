package com.hthk.fintech.model.test;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

import java.time.LocalDateTime;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/27 8:53
 */
@FieldOrder({"strategyName", "lastTradeDateTime", "count"})
public class ProductUsage {

    @CSVField(header = "strategyName")
    private String strategyName;

    @CSVField(header = "lastTradeDateTime")
    private LocalDateTime lastTradeDateTime;

    @CSVField(header = "count")
    private String count;

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    public LocalDateTime getLastTradeDateTime() {
        return lastTradeDateTime;
    }

    public void setLastTradeDateTime(LocalDateTime lastTradeDateTime) {
        this.lastTradeDateTime = lastTradeDateTime;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
