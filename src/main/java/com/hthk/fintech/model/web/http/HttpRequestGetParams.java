package com.hthk.fintech.model.web.http;

import com.hthk.fintech.model.software.app.ApplicationEnum;
import com.hthk.fintech.model.software.app.ApplicationInstance;

import static com.hthk.fintech.model.web.http.ActionTypeEnum.*;

/**
 * @Author: Rock CHEN
 * @Date: 2023/12/21 9:40
 */
@HttpRequestParams(names = {GET, COUNT, PRICE, SYNCHRONIZE, COPY_ADD, PROCESS, AMEND, DATE_RANGE_PRICE})
public class HttpRequestGetParams implements ApplicationSourceParams {

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
