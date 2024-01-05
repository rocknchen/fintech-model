package com.hthk.fintech.model.web.http;

import com.hthk.fintech.model.software.app.ApplicationEnum;
import com.hthk.fintech.model.software.app.ApplicationInstance;

import static com.hthk.fintech.model.web.http.ActionTypeEnum.COUNT;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/5 12:11
 */
@HttpRequestParams(name = COUNT)
public class HttpRequestCountParams implements ApplicationSourceParams {

    private ApplicationInstance source;

    public ApplicationInstance getSource() {
        return source;
    }

    public void setSource(ApplicationInstance source) {
        this.source = source;
    }

    @Override
    public ApplicationEnum getApplicationSource() {
        return source.getName();
    }

}
