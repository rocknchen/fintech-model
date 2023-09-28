package com.hthk.calypsox.model.audit;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "book", "key", "tradeId",
        "updatedFieldName", "updatedDateTime",
        "updatedUser", "oldValue", "newValue",
        "version"
})
public class TradeAuditCSVDTO {

    @CSVField(header = "Book")
    private String book;

    @CSVField(header = "Key")
    private String key;

    @CSVField(header = "Trade Id")
    private String tradeId;

    @CSVField(header = "Updated Field Name")
    private String updatedFieldName;

    @CSVField(header = "Updated Date Time")
    private String updatedDateTime;

    @CSVField(header = "Updated User")
    private String updatedUser;

    @CSVField(header = "Old Value")
    private String oldValue;

    @CSVField(header = "New Value")
    private String newValue;

    @CSVField(header = "Version")
    private String version;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUpdatedFieldName() {
        return updatedFieldName;
    }

    public void setUpdatedFieldName(String updatedFieldName) {
        this.updatedFieldName = updatedFieldName;
    }

    public String getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(String updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public String getUpdatedUser() {
        return updatedUser;
    }

    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
