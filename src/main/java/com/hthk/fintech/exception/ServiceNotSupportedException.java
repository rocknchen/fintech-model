package com.hthk.fintech.exception;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 15:31
 */
public class ServiceNotSupportedException extends Exception {

    public ServiceNotSupportedException() {
    }

    public ServiceNotSupportedException(String message) {
        super(message);
    }

    public ServiceNotSupportedException(
            String message,
            Throwable cause
    ) {
        super(message, cause);
    }

}
