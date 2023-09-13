package com.hthk.calypsox.model.staticdata.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "name",
        "category", "isInBookTemplate",
        "actionPoint", "remain", "remain2", "remain3"
})
public class BookInfoCustomCSVDTO {

    @CSVField(header = "Book Name")
    private String name;

    @CSVField(header = "Book Category")
    private String category;

    @CSVField(header = "In Booking Template?")
    private String isInBookTemplate;

    @CSVField(header = "Fix Action Point")
    private String actionPoint;

    @CSVField(header = "Remain Action")
    private String remain;

    @CSVField(header = "Remain Action 2")
    private String remain2;

    @CSVField(header = "Remain Action 3")
    private String remain3;

    public String getIsInBookTemplate() {
        return isInBookTemplate;
    }

    public void setIsInBookTemplate(String isInBookTemplate) {
        this.isInBookTemplate = isInBookTemplate;
    }

    public String getRemain2() {
        return remain2;
    }

    public void setRemain2(String remain2) {
        this.remain2 = remain2;
    }

    public String getRemain3() {
        return remain3;
    }

    public void setRemain3(String remain3) {
        this.remain3 = remain3;
    }

    public String getRemain() {
        return remain;
    }

    public void setRemain(String remain) {
        this.remain = remain;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
