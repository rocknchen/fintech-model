package com.hthk.fintech.model.data;

import com.hthk.fintech.model.data.basic.AbstractDataSource;

import static com.hthk.fintech.model.data.DataSourceTypeEnum.*;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 15:29
 */
public class DataSourceFolder extends AbstractDataSource {

    private String path;

    public DataSourceFolder() {
        type = FOLDER;
    }

    public DataSourceFolder(String path) {
        this();
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
