package com.hthk.calypsox.model.staticdata.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "team",
        "legalEntity",
        "department",
        "tradingDesk", "businessType", "business",
        "id", "name",
        "baseCurrency",
        "omsSystem", "bbTraderPortfolio", "risk",
        "actionPoint"
})
public class BookCalCSVDTO {

    @CSVField(header = "Team")
    private String team;

    @CSVField(header = "Book Id")
    private String id;

    @CSVField(header = "Book Name")
    private String name;

    @CSVField(header = "法人主体")
    private String legalEntity;

    @CSVField(header = "Base Currency")
    private String baseCurrency;

//    @CSVField(header = "公司简称")
//    private String companyShortName;

    @CSVField(header = "Department")
    private String department;

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

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getActionPoint() {
        return actionPoint;
    }

    public void setActionPoint(String actionPoint) {
        this.actionPoint = actionPoint;
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


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }
}
