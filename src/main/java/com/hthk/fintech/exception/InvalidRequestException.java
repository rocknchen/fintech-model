package com.hthk.fintech.exception;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/20 14:28
 */
public class InvalidRequestException extends Exception {

    public InvalidRequestException() {
    }

    public InvalidRequestException(String message) {
        super(message);
    }

    public InvalidRequestException(
            String message,
            Throwable cause
    ) {
        super(message, cause);
    }

}

