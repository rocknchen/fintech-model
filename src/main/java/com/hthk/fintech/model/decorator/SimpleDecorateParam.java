package com.hthk.fintech.model.decorator;

import com.hthk.fintech.model.param.ExtProviderDO;

import java.util.List;

/**
 * @Author: Rock CHEN
 * @Date: 2024/2/8 14:15
 */
public class SimpleDecorateParam {

    private List<String> valueList;

    private String connector;

    private List<ExtProviderDO> extProviderList;

    public List<String> getValueList() {
        return valueList;
    }

    public void setValueList(List<String> valueList) {
        this.valueList = valueList;
    }

    public String getConnector() {
        return connector;
    }

    public void setConnector(String connector) {
        this.connector = connector;
    }

    public List<ExtProviderDO> getExtProviderList() {
        return extProviderList;
    }

    public void setExtProviderList(List<ExtProviderDO> extProviderList) {
        this.extProviderList = extProviderList;
    }
}

