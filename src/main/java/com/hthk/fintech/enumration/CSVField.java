package com.hthk.fintech.enumration;

import com.hthk.fintech.converter.impl.AttStringDefaultConverter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface CSVField {

    String header();

    Class<?> converter() default AttStringDefaultConverter.class;

}
