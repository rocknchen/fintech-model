package com.hthk.fintech.model.staticdata;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

/**
 * @Author: Rock CHEN
 * @Date: 2024/2/29 17:16
 */
@FieldOrder({"id", "name",
        "baseCurrency"})
public class BookInfoVO1 {

    @CSVField(header = "id")
    private String id;

    @CSVField(header = "name")
    private String name;

    @CSVField(header = "baseCurrency")
    private String baseCurrency;

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


    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

}
