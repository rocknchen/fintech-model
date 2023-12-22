package com.hthk.fintech.model.web.http;

/**
 * @Author: Rock CHEN
 * @Date: 2023/12/20 16:33
 */
public class IRequestAction<P> {

    private HttpRequestActionTypeEnum name;

    private P params;

    public HttpRequestActionTypeEnum getName() {
        return name;
    }

    public void setName(HttpRequestActionTypeEnum name) {
        this.name = name;
    }

    public P getParams() {
        return params;
    }

    public void setParams(P params) {
        this.params = params;
    }
}
