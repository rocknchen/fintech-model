package com.hthk.fintech.model.common;

import com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum;
import com.hthk.fintech.model.web.http.ActionTypeEnum;

import java.util.Objects;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/2 18:53
 */
public class ServiceKey {

    private ActionTypeEnum action;

    private EntityTypeEnum type;

    private String subType1;

    private String subType2;

    private String subType3;

    private String subType4;

    private String subType5;

    public ServiceKey() {
    }

    public ServiceKey(ActionTypeEnum action, EntityTypeEnum type, String subType1, String subType2, String subType3, String subType4, String subType5) {
        this.action = action;
        this.type = type;
        this.subType1 = subType1;
        this.subType2 = subType2;
        this.subType3 = subType3;
        this.subType4 = subType4;
        this.subType5 = subType5;
    }

    public ActionTypeEnum getAction() {
        return action;
    }

    public EntityTypeEnum getType() {
        return type;
    }

    public String getSubType1() {
        return subType1;
    }

    public String getSubType2() {
        return subType2;
    }

    public String getSubType3() {
        return subType3;
    }

    public String getSubType4() {
        return subType4;
    }

    public String getSubType5() {
        return subType5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(action).append(",")
                .append(type).append(",")
                .append(subType1).append(",").append(subType2).append(",")
                .append(subType3).append(",").append(subType4).append(",")
                .append(subType5)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceKey that = (ServiceKey) o;
        return action == that.action && type == that.type && Objects.equals(subType1, that.subType1) && Objects.equals(subType2, that.subType2) && Objects.equals(subType3, that.subType3) && Objects.equals(subType4, that.subType4) && Objects.equals(subType5, that.subType5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, type, subType1, subType2, subType3, subType4, subType5);
    }
}
