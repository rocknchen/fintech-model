package com.hthk.calypsox.model.audit;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "tradeId", "version"
})
public class TradeAuditCSVDTO {

    @CSVField(header = "Trade Id")
    private String tradeId;

    @CSVField(header = "Version")
    private String version;

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
