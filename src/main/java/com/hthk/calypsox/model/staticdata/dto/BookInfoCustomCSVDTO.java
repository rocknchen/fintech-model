package com.hthk.calypsox.model.staticdata.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "name",
        "team",
        "actionPoint", "remain"
})
public class BookInfoCustomCSVDTO {

    @CSVField(header = "Book Name")
    private String name;

    @CSVField(header = "Team")
    private String team;

    @CSVField(header = "Fix Action Point")
    private String actionPoint;

    @CSVField(header = "Remain Action")
    private String remain;

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

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
