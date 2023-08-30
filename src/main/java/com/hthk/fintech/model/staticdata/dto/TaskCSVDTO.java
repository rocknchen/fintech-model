package com.hthk.fintech.model.staticdata.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({"taskType", "externalReference", "tradeFilter",
        "pricingEnv", "timeZone",
        "valuationTime",
        "valuationDateOffset", "businessHolidays",
        "pnlParam",
        "attributes"
})
public class TaskCSVDTO {

    @CSVField(header = "Task Type")
    private String taskType;

    @CSVField(header = "External Reference")
    private String externalReference;

    @CSVField(header = "Trade Filter")
    private String tradeFilter;

    @CSVField(header = "Pricing Environment")
    private String pricingEnv;

    @CSVField(header = "Time Zone")
    private String timeZone;

    @CSVField(header = "Val Time")
    private String valuationTime;

    @CSVField(header = "Date Offset")
    private String valuationDateOffset;

    @CSVField(header = "Business Holidays")
    private String businessHolidays;

    @CSVField(header = "Task Attributes")
    private String attributes;

    @CSVField(header = "PnL Param")
    private String pnlParam;

    @CSVField(header = "Report Type")
    private String reportType;

    @CSVField(header = "Report File Name")
    private String reportFileName;

    @CSVField(header = "Report Format")
    private String reportFormat;

    @CSVField(header = "Report Template Name")
    private String reportTemplateName;

    @CSVField(header = "Report Output Template")
    private String reportOutputTemplate;

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportFileName() {
        return reportFileName;
    }

    public void setReportFileName(String reportFileName) {
        this.reportFileName = reportFileName;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public String getReportTemplateName() {
        return reportTemplateName;
    }

    public void setReportTemplateName(String reportTemplateName) {
        this.reportTemplateName = reportTemplateName;
    }

    public String getReportOutputTemplate() {
        return reportOutputTemplate;
    }

    public void setReportOutputTemplate(String reportOutputTemplate) {
        this.reportOutputTemplate = reportOutputTemplate;
    }

    public String getPnlParam() {
        return pnlParam;
    }

    public void setPnlParam(String pnlParam) {
        this.pnlParam = pnlParam;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getPricingEnv() {
        return pricingEnv;
    }

    public void setPricingEnv(String pricingEnv) {
        this.pricingEnv = pricingEnv;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    public String getTradeFilter() {
        return tradeFilter;
    }

    public void setTradeFilter(String tradeFilter) {
        this.tradeFilter = tradeFilter;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getValuationTime() {
        return valuationTime;
    }

    public void setValuationTime(String valuationTime) {
        this.valuationTime = valuationTime;
    }

    public String getValuationDateOffset() {
        return valuationDateOffset;
    }

    public void setValuationDateOffset(String valuationDateOffset) {
        this.valuationDateOffset = valuationDateOffset;
    }

    public String getBusinessHolidays() {
        return businessHolidays;
    }

    public void setBusinessHolidays(String businessHolidays) {
        this.businessHolidays = businessHolidays;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }
}
