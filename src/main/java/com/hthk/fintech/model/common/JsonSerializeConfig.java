package com.hthk.fintech.model.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/2 11:58
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface JsonSerializeConfig {

    Class<?> target();

    String[] ignoreFields() default "";

    String[] ignoreFunctions() default "";

}
