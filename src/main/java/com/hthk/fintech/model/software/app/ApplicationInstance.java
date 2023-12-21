package com.hthk.fintech.model.software.app;

/**
 * @Author: Rock CHEN
 * @Date: 2023/12/21 9:49
 */
public class ApplicationInstance {

    private ApplicationEnum name;

    private String instance;

    public ApplicationInstance() {
    }

    public ApplicationEnum getName() {
        return name;
    }

    public void setName(ApplicationEnum name) {
        this.name = name;
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

}
