package com.hthk.fintech.model.web.http;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/4 11:54
 */
public class HttpServerContext {

    private String mappingPath;

    private String handlerBeanName;

    public HttpServerContext() {
    }

    public HttpServerContext(String mappingPath, String handlerBeanName) {
        this.mappingPath = mappingPath;
        this.handlerBeanName = handlerBeanName;
    }

    public String getMappingPath() {
        return mappingPath;
    }

    public void setMappingPath(String mappingPath) {
        this.mappingPath = mappingPath;
    }

    public String getHandlerBeanName() {
        return handlerBeanName;
    }

    public void setHandlerBeanName(String handlerBeanName) {
        this.handlerBeanName = handlerBeanName;
    }
}
