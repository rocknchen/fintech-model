package com.hthk.fintech.model.web.http;

import com.hthk.fintech.model.software.app.ApplicationInstance;

import static com.hthk.fintech.model.web.http.HttpRequestActionTypeEnum.GET;

/**
 * @Author: Rock CHEN
 * @Date: 2023/12/21 9:40
 */
@HttpRequestParams(name = GET)
public class HttpRequestGetParams {

    private ApplicationInstance appInstance;

    public ApplicationInstance getAppInstance() {
        return appInstance;
    }

    public void setAppInstance(ApplicationInstance appInstance) {
        this.appInstance = appInstance;
    }

}