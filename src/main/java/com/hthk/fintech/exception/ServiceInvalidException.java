package com.hthk.fintech.exception;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 15:34
 */
public class ServiceInvalidException extends Exception {

    public ServiceInvalidException() {
    }

    public ServiceInvalidException(String message) {
        super(message);
    }

    public ServiceInvalidException(
            String message,
            Throwable cause
    ) {
        super(message, cause);
    }

}
