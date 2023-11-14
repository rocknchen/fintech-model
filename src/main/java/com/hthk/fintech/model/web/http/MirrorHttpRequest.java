package com.hthk.fintech.model.web.http;

import com.hthk.fintech.model.data.datacenter.query.MirrorDataQueryRequest;
import com.hthk.fintech.model.software.app.Application;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/14 21:29
 */
public class MirrorHttpRequest {

    private Application source;

    private MirrorDataQueryRequest data;

    public Application getSource() {
        return source;
    }

    public void setSource(Application source) {
        this.source = source;
    }

    public MirrorDataQueryRequest getData() {
        return data;
    }

    public void setData(MirrorDataQueryRequest data) {
        this.data = data;
    }
}
