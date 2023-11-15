package com.hthk.fintech.model.data.basic;

import com.hthk.fintech.model.data.DataSourceTypeEnum;
import com.hthk.fintech.model.data.IDataSource;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 15:05
 */
public abstract class AbstractDataSource implements IDataSource {

    protected DataSourceTypeEnum type;

    @Override
    public DataSourceTypeEnum getType() {
        return type;
    }

    public void setType(DataSourceTypeEnum type) {
        this.type = type;
    }

}
