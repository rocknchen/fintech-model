package com.hthk.fintech.model.data.datacenter.query;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/14 21:29
 */
public class MirrorDataQueryRequest {

    private EntityCriteria entity;

    private DataSnapshot snapshot;

    private Object criteria;

    public void setCriteria(Object criteria) {
        this.criteria = criteria;
    }

    public EntityCriteria getEntity() {
        return entity;
    }

    public void setEntity(EntityCriteria entity) {
        this.entity = entity;
    }

    public DataSnapshot getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(DataSnapshot snapshot) {
        this.snapshot = snapshot;
    }
}
