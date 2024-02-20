package com.hthk.fintech.model.staticdata;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

/**
 * @Author: Rock CHEN
 * @Date: 2024/2/20 15:54
 */
@FieldOrder({"id", "name", "activity",
        "baseCurrency", "accessCurrency", "accessCurrencyPair",
        "accessProduct", "testStatus"})
public class BookInfo {

    @CSVField(header = "id")
    private String id;

    @CSVField(header = "name")
    private String name;

    @CSVField(header = "activity")
    private String activity;

    @CSVField(header = "baseCurrency")
    private String baseCurrency;

    @CSVField(header = "accessCurrency")
    private String accessCurrency;

    @CSVField(header = "accessCurrencyPair")
    private String accessCurrencyPair;

    @CSVField(header = "accessProduct")
    private String accessProduct;

    @CSVField(header = "attr.TEST_STATUS")
    private String testStatus;

    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }

    public String getAccessCurrency() {
        return accessCurrency;
    }

    public void setAccessCurrency(String accessCurrency) {
        this.accessCurrency = accessCurrency;
    }

    public String getAccessCurrencyPair() {
        return accessCurrencyPair;
    }

    public void setAccessCurrencyPair(String accessCurrencyPair) {
        this.accessCurrencyPair = accessCurrencyPair;
    }

    public String getAccessProduct() {
        return accessProduct;
    }

    public void setAccessProduct(String accessProduct) {
        this.accessProduct = accessProduct;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }
}
