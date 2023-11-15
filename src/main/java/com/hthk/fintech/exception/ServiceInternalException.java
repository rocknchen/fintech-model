package com.hthk.fintech.exception;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 18:32
 */
public class ServiceInternalException extends Exception {

    public ServiceInternalException() {
    }

    public ServiceInternalException(String message) {
        super(message);
    }

    public ServiceInternalException(
            String message,
            Throwable cause
    ) {
        super(message, cause);
    }

}