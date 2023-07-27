package com.hthk.fintech.converter;

public interface AttributeStringConverter<T> {

    default String process(T input) {
        return input.toString();
    }

}
