package com.hthk.fintech.model.web.http;

/**
 * @Author: Rock CHEN
 * @Date: 2023/12/20 16:33
 */
public class IRequestAction<P> {

    private ActionTypeEnum name;

    private P params;

    public IRequestAction() {
    }

    public IRequestAction(ActionTypeEnum name, P params) {
        this.name = name;
        this.params = params;
    }

    public ActionTypeEnum getName() {
        return name;
    }

    public void setName(ActionTypeEnum name) {
        this.name = name;
    }

    public P getParams() {
        return params;
    }

    public void setParams(P params) {
        this.params = params;
    }
}
