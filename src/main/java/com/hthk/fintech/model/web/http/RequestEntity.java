package com.hthk.fintech.model.web.http;

import com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum;

/**
 * @Author: Rock CHEN
 * @Date: 2023/12/20 16:35
 */
public class RequestEntity {

    private EntityTypeEnum type;

    private String subType1;

    private String subType2;

    private String subType3;

    private String subType4;

    private String subType5;

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
}
