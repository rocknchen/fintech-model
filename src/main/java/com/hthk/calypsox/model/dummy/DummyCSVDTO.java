package com.hthk.calypsox.model.dummy;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "keyId", "name"
})
public class DummyCSVDTO {

    @CSVField(header = "keyId")
    private String keyId;

    @CSVField(header = "Name")
    private String name;

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
