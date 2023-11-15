package com.hthk.fintech.model.data;

import com.hthk.fintech.model.data.basic.AbstractDataSource;

import static com.hthk.fintech.model.data.DataSourceTypeEnum.DATABASE_ORACLE;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 17:44
 */
public class DataSourceDBOracle extends AbstractDataSource {

    public DataSourceDBOracle() {
        type = DATABASE_ORACLE;
    }

}
