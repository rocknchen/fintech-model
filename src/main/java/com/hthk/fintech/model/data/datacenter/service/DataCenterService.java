package com.hthk.fintech.model.data.datacenter.service;

import com.hthk.fintech.model.data.DataSourceTypeEnum;
import com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 17:31
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DataCenterService {

    ApplicationEnum sourceName();

    DataSourceTypeEnum sourceType();

    EntityTypeEnum entityType();

}
