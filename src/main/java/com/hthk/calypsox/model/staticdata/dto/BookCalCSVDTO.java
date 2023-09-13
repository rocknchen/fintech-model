package com.hthk.calypsox.model.staticdata.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "category",
        "legalEntity",
        "name",
        "tradingDesk", "business", "businessType",
        "tradingDeskFix", "businessFix", "businessTypeFix",
        "isInBookTemplate",
        "productRest", "pnlTreatment", "baseCurrency",
        "actionPoint",
        "comments",
        "omsSystem", "bbTraderPortfolio", "risk"
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

    @CSVField(header = "Trading Desk(调整后)")
    private String tradingDeskFix;

    @CSVField(header = "交易性质")
    private String businessType;

    @CSVField(header = "交易性质(调整后)")
    private String businessTypeFix;

    @CSVField(header = "业务类别")
    private String business;

    @CSVField(header = "业务类别(调整后)")
    private String businessFix;

    @CSVField(header = "源头系统")
    private String omsSystem;

    @CSVField(header = "BB_TRADER_PORTFOLIO")
    private String bbTraderPortfolio;

    @CSVField(header = "风险小组")
    private String risk;

    @CSVField(header = "In Booking Template?")
    private String isInBookTemplate;

    @CSVField(header = "数据修复Action Point(如有)")
    private String actionPoint;

    @CSVField(header = "Comments")
    private String comments;

    @CSVField(header = "Book Product Restriction")
    private String productRest;

    @CSVField(header = "Book PnL Treatment")
    private String pnlTreatment;

    public String getProductRest() {
        return productRest;
    }

    public void setProductRest(String productRest) {
        this.productRest = productRest;
    }

    public String getPnlTreatment() {
        return pnlTreatment;
    }

    public void setPnlTreatment(String pnlTreatment) {
        this.pnlTreatment = pnlTreatment;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getTradingDeskFix() {
        return tradingDeskFix;
    }

    public void setTradingDeskFix(String tradingDeskFix) {
        this.tradingDeskFix = tradingDeskFix;
    }

    public String getBusinessTypeFix() {
        return businessTypeFix;
    }

    public void setBusinessTypeFix(String businessTypeFix) {
        this.businessTypeFix = businessTypeFix;
    }

    public String getBusinessFix() {
        return businessFix;
    }

    public void setBusinessFix(String businessFix) {
        this.businessFix = businessFix;
    }

    public String getIsInBookTemplate() {
        return isInBookTemplate;
    }

    public void setIsInBookTemplate(String isInBookTemplate) {
        this.isInBookTemplate = isInBookTemplate;
    }

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
