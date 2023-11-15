package com.hthk.fintech.model.data.datacenter.query;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/14 19:20
 */
public class DataQueryRequest<T extends IDataCriteria> {

    private EntityCriteria entity;

    private DataSnapshot snapshot;

    private T criteria;

    public DataQueryRequest() {
    }

    public EntityCriteria getEntity() {
        return entity;
    }

    public void setEntity(EntityCriteria entity) {
        this.entity = entity;
    }

    public T getCriteria() {
        return criteria;
    }

    public void setCriteria(T criteria) {
        this.criteria = criteria;
    }

    public DataSnapshot getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(DataSnapshot snapshot) {
        this.snapshot = snapshot;
    }
}
