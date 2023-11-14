package com.hthk.fintech.model.software.app;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/14 18:14
 */
public class Application {

    private String name;

    private AppVersion appVersion;

    private String instance;

    public Application() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppVersion getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(AppVersion appVersion) {
        this.appVersion = appVersion;
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }
}
