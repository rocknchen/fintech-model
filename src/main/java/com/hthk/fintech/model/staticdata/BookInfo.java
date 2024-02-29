package com.hthk.fintech.model.staticdata;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

/**
 * @Author: Rock CHEN
 * @Date: 2024/2/20 15:54
 */
@FieldOrder({"legalEntity", "name", "id",
        "activity", "accessCurrency", "accessCurrencyPair",
        "accessProduct", "testStatus", "tradingDesk",
        "businessType", "tradingType", "business",
        "companyShortName", "department", "system",
        "tradingDeskRisk", "riskTeam", "riskSubTeam",
        "bbTraderPortfolio", "baseCurrency", "location",
        "endOfDay", "holidays"})
public class BookInfo {

    @CSVField(header = "legalEntity")
    private String legalEntity;

    @CSVField(header = "name")
    private String name;

    @CSVField(header = "id")
    private String id;

    @CSVField(header = "activity")
    private String activity;

    @CSVField(header = "accessCurrency")
    private String accessCurrency;

    @CSVField(header = "accessCurrencyPair")
    private String accessCurrencyPair;

    @CSVField(header = "accessProduct")
    private String accessProduct;

    @CSVField(header = "attr.TEST_STATUS")
    private String testStatus;

    @CSVField(header = "attr.Trading Desk")
    private String tradingDesk;

    @CSVField(header = "attr.业务类别")
    private String businessType;

    @CSVField(header = "attr.交易性质")
    private String tradingType;

    @CSVField(header = "attr.Business")
    private String business;

    @CSVField(header = "attr.公司简称")
    private String companyShortName;

    @CSVField(header = "attr.Department")
    private String department;

    @CSVField(header = "attr.系统")
    private String system;

    @CSVField(header = "attr.Trading Desk Risk")
    private String tradingDeskRisk;

    @CSVField(header = "attr.风险小组")
    private String riskTeam;

    @CSVField(header = "attr.风险次小组")
    private String riskSubTeam;

    @CSVField(header = "attr.BB_TRADER_PORTFOLIO")
    private String bbTraderPortfolio;

    @CSVField(header = "baseCurrency")
    private String baseCurrency;

    @CSVField(header = "Location")
    private String location;

    @CSVField(header = "End Of Day")
    private String endOfDay;

    @CSVField(header = "Holidays")
    private String holidays;

    public String getBbTraderPortfolio() {
        return bbTraderPortfolio;
    }

    public void setBbTraderPortfolio(String bbTraderPortfolio) {
        this.bbTraderPortfolio = bbTraderPortfolio;
    }

    public String getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
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

    public String getTradingType() {
        return tradingType;
    }

    public void setTradingType(String tradingType) {
        this.tradingType = tradingType;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getCompanyShortName() {
        return companyShortName;
    }

    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getTradingDeskRisk() {
        return tradingDeskRisk;
    }

    public void setTradingDeskRisk(String tradingDeskRisk) {
        this.tradingDeskRisk = tradingDeskRisk;
    }

    public String getRiskTeam() {
        return riskTeam;
    }

    public void setRiskTeam(String riskTeam) {
        this.riskTeam = riskTeam;
    }

    public String getRiskSubTeam() {
        return riskSubTeam;
    }

    public void setRiskSubTeam(String riskSubTeam) {
        this.riskSubTeam = riskSubTeam;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEndOfDay() {
        return endOfDay;
    }

    public void setEndOfDay(String endOfDay) {
        this.endOfDay = endOfDay;
    }

    public String getHolidays() {
        return holidays;
    }

    public void setHolidays(String holidays) {
        this.holidays = holidays;
    }

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
