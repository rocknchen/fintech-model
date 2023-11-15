package com.hthk.fintech.model.data;

import com.hthk.fintech.model.data.basic.AbstractDataSource;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 15:29
 */
public class DataSourceFolder extends AbstractDataSource {

    private String path;

    public DataSourceFolder() {
    }

    public DataSourceFolder(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
