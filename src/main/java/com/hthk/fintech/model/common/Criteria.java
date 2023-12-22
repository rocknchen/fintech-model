package com.hthk.fintech.model.common;

import com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum;
import com.hthk.fintech.model.software.app.ApplicationEnum;
import com.hthk.fintech.model.web.http.ActionTypeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Rock CHEN
 * @Date: 2023/12/22 17:07
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Criteria {

    ActionTypeEnum action();

    EntityTypeEnum type();

    String subType1() default "";

    String subType2() default "";

    String subType3() default "";

    String subType4() default "";

    String subType5() default "";

    ApplicationEnum appName() default ApplicationEnum.NA;


}
