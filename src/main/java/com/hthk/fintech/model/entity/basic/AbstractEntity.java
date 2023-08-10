package com.hthk.fintech.model.entity.basic;

import java.util.Properties;

public abstract class AbstractEntity {

    protected Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
