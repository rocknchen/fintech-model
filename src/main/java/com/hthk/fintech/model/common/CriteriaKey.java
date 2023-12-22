package com.hthk.fintech.model.common;

import com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum;
import com.hthk.fintech.model.software.app.ApplicationEnum;
import com.hthk.fintech.model.web.http.ActionTypeEnum;

/**
 * @Author: Rock CHEN
 * @Date: 2023/12/22 17:18
 */
public class CriteriaKey {

    private ActionTypeEnum action;

    private EntityTypeEnum type;

    private String subType1;

    private String subType2;

    private String subType3;

    private String subType4;

    private String subType5;

    private ApplicationEnum appName;

    public CriteriaKey() {
    }

    public CriteriaKey(ActionTypeEnum action, EntityTypeEnum type, String subType1, String subType2, String subType3, String subType4, String subType5, ApplicationEnum appName) {
        this.action = action;
        this.type = type;
        this.subType1 = subType1;
        this.subType2 = subType2;
        this.subType3 = subType3;
        this.subType4 = subType4;
        this.subType5 = subType5;
        this.appName = appName;
    }

    public ActionTypeEnum getAction() {
        return action;
    }

    public void setAction(ActionTypeEnum action) {
        this.action = action;
    }

    public EntityTypeEnum getType() {
        return type;
    }

    public void setType(EntityTypeEnum type) {
        this.type = type;
    }

    public String getSubType1() {
        return subType1;
    }

    public void setSubType1(String subType1) {
        this.subType1 = subType1;
    }

    public String getSubType2() {
        return subType2;
    }

    public void setSubType2(String subType2) {
        this.subType2 = subType2;
    }

    public String getSubType3() {
        return subType3;
    }

    public void setSubType3(String subType3) {
        this.subType3 = subType3;
    }

    public String getSubType4() {
        return subType4;
    }

    public void setSubType4(String subType4) {
        this.subType4 = subType4;
    }

    public String getSubType5() {
        return subType5;
    }

    public void setSubType5(String subType5) {
        this.subType5 = subType5;
    }

    public ApplicationEnum getAppName() {
        return appName;
    }

    public void setAppName(ApplicationEnum appName) {
        this.appName = appName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(action).append(",")
                .append(type).append(",")
                .append(subType1).append(",").append(subType2).append(",")
                .append(subType3).append(",").append(subType4).append(",")
                .append(subType5).append(",")
                .append(appName)
                .toString();
    }
}
