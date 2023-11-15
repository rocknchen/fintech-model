package com.hthk.fintech.model.web.http;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/14 14:34
 */
public enum HttpStatusCodeEnum {

    SUCCESS(200, "success"),

    FAIL(400, "fail"),

    INTERNAL_ERROR(500, "internal error");

    private int statusCode;

    private String displayMessage;

    HttpStatusCodeEnum(int statusCode, String displayMessage) {
        this.statusCode = statusCode;
        this.displayMessage = displayMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }
}
