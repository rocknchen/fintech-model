package com.hthk.fintech.model.param;

/**
 * @Author: Rock CHEN
 * @Date: 2024/2/8 14:53
 */
public class ExtProviderDO<T> {

    private String name;

    private T config;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getConfig() {
        return config;
    }

    public void setConfig(T config) {
        this.config = config;
    }
}
