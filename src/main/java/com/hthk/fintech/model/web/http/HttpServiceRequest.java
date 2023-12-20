package com.hthk.fintech.model.web.http;

/**
 * @Author: Rock CHEN
 * @Date: 2023/12/20 16:37
 */
public class HttpServiceRequest<P, C> {

    private IRequestAction<P> action;

    private RequestDateTime dateTime;

    private RequestEntity entity;

    private C criteria;

    public HttpServiceRequest() {
    }

    public IRequestAction<P> getAction() {
        return action;
    }

    public void setAction(IRequestAction<P> action) {
        this.action = action;
    }

    public RequestDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(RequestDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public RequestEntity getEntity() {
        return entity;
    }

    public void setEntity(RequestEntity entity) {
        this.entity = entity;
    }

    public C getCriteria() {
        return criteria;
    }

    public void setCriteria(C criteria) {
        this.criteria = criteria;
    }
}
