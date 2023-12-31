package com.hthk.fintech.model.quote.dto;


import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({"date", "instrumentGroup", "basicInstrumentGroup", "securityGroup",
        "name", "isin", "cusip", "bbTicker", "source",
        "quoteType", "close",
        "enteredUser", "enteredDateTime",
        "updatedUser", "updatedDateTime"
})
public class QuoteCSVDTO {

    @CSVField(header = "Date")
    private String date;

    @CSVField(header = "Instrument Group")
    private String instrumentGroup;

    @CSVField(header = "Basic Instrument Group")
    private String basicInstrumentGroup;

    @CSVField(header = "Security Group")
    private String securityGroup;

    @CSVField(header = "Name")
    private String name;

    @CSVField(header = "ISIN")
    private String isin;

    @CSVField(header = "CUSIP")
    private String cusip;

    @CSVField(header = "BB Ticker")
    private String bbTicker;

    @CSVField(header = "Source")
    private String source;

    @CSVField(header = "Quote Type")
    private String quoteType;

    @CSVField(header = "Close")
    private String close;

    @CSVField(header = "Entered User")
    private String enteredUser;

    @CSVField(header = "Entered Date Time")
    private String enteredDateTime;

    @CSVField(header = "Updated User")
    private String updatedUser;

    @CSVField(header = "Updated Date Time")
    private String updatedDateTime;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getEnteredUser() {
        return enteredUser;
    }

    public void setEnteredUser(String enteredUser) {
        this.enteredUser = enteredUser;
    }

    public String getEnteredDateTime() {
        return enteredDateTime;
    }

    public void setEnteredDateTime(String enteredDateTime) {
        this.enteredDateTime = enteredDateTime;
    }

    public String getUpdatedUser() {
        return updatedUser;
    }

    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    public String getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(String updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInstrumentGroup() {
        return instrumentGroup;
    }

    public void setInstrumentGroup(String instrumentGroup) {
        this.instrumentGroup = instrumentGroup;
    }

    public String getBasicInstrumentGroup() {
        return basicInstrumentGroup;
    }

    public void setBasicInstrumentGroup(String basicInstrumentGroup) {
        this.basicInstrumentGroup = basicInstrumentGroup;
    }

    public String getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public String getBbTicker() {
        return bbTicker;
    }

    public void setBbTicker(String bbTicker) {
        this.bbTicker = bbTicker;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }
}
