package com.hthk.fintech.model.web.http;

import com.hthk.fintech.model.software.app.Application;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/14 14:15
 */
public class HttpRequest<T> {

    private Application source;

    private T data;

    public HttpRequest() {
    }

    public HttpRequest(Application source) {
        this.source = source;
    }

    public HttpRequest(Application source, T data) {
        this.source = source;
        this.data = data;
    }

    public Application getSource() {
        return source;
    }

    public void setSource(Application source) {
        this.source = source;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
