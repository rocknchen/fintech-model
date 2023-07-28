package com.hthk.fintech.enumration;

import com.hthk.fintech.serialize.ModelDeserializeController;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface CSVModel {

    Class<? extends ModelDeserializeController> deserializeController();

}
