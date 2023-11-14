package com.hthk.fintech.model.data.datacenter.query;

import com.hthk.fintech.model.software.app.ApplicationEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/14 19:42
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DataCriteria {

    ApplicationEnum sourceName();

    EntityTypeEnum entityType();

}
