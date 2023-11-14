package com.hthk.fintech.model.web.http;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/14 14:15
 */
public class HttpResponse<R> {

    private HttpStatusCodeEnum statusCode;

    private String message;

    private R data;

    public HttpResponse() {
    }

    public HttpResponse(HttpStatusCodeEnum statusCode) {
        this.statusCode = statusCode;
    }

    public HttpResponse(HttpStatusCodeEnum statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public HttpResponse(HttpStatusCodeEnum statusCode, String message, R data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public HttpStatusCodeEnum getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatusCodeEnum statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public R getData() {
        return data;
    }

    public void setData(R data) {
        this.data = data;
    }

}
