package com.hthk.fintech.model.staticdata.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({"externalReference"
})
public class TaskCSVDTO {

    @CSVField(header = "External Reference")
    private String externalReference;

    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }
}
