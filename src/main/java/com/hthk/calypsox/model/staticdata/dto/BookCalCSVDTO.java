package com.hthk.calypsox.model.staticdata.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "category",
        "legalEntity",
        "tradingDesk", "businessType", "business",
        "name",
        "baseCurrency",
        "omsSystem", "bbTraderPortfolio", "risk",
        "actionPoint"
})
public class BookCalCSVDTO {

    @CSVField(header = "Book Category")
    private String category;

//    @CSVField(header = "Book Id")
//    private String id;

    @CSVField(header = "Book Name")
    private String name;

    @CSVField(header = "Legal Entity")
    private String legalEntity;

    @CSVField(header = "Base Currency")
    private String baseCurrency;

//    @CSVField(header = "公司简称")
//    private String companyShortName;

//    @CSVField(header = "Department")
//    private String department;

    @CSVField(header = "Trading Desk")
    private String tradingDesk;

    @CSVField(header = "交易性质")
    private String businessType;

    @CSVField(header = "业务类别")
    private String business;

    @CSVField(header = "源头系统")
    private String omsSystem;

    @CSVField(header = "BB_TRADER_PORTFOLIO")
    private String bbTraderPortfolio;

    @CSVField(header = "风险小组")
    private String risk;

    @CSVField(header = "数据修复Action Point(如有)")
    private String actionPoint;

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getActionPoint() {
        return actionPoint;
    }

    public void setActionPoint(String actionPoint) {
        this.actionPoint = actionPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }


    public String getTradingDesk() {
        return tradingDesk;
    }

    public void setTradingDesk(String tradingDesk) {
        this.tradingDesk = tradingDesk;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getOmsSystem() {
        return omsSystem;
    }

    public void setOmsSystem(String omsSystem) {
        this.omsSystem = omsSystem;
    }

    public String getBbTraderPortfolio() {
        return bbTraderPortfolio;
    }

    public void setBbTraderPortfolio(String bbTraderPortfolio) {
        this.bbTraderPortfolio = bbTraderPortfolio;
    }

}
