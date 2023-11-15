package com.hthk.fintech.converter;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 19:43
 */
public interface IConverter<T, R> {

    R process(T entity);

}
