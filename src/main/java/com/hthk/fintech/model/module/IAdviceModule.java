package com.hthk.fintech.model.module;

import com.hthk.fintech.exception.ServiceInternalException;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/4 21:36
 */
public interface IAdviceModule {

    void before() throws ServiceInternalException;

}
