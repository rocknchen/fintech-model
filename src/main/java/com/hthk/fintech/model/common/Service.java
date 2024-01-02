package com.hthk.fintech.model.common;

import com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum;
import com.hthk.fintech.model.web.http.ActionTypeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/2 17:23
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Service {

    ActionTypeEnum action();

    EntityTypeEnum type();

    String subType1() default "";

    String subType2() default "";

    String subType3() default "";

    String subType4() default "";

    String subType5() default "";

}
