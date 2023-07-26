package com.hthk.fintech.exception;

public class AttributeInvalidException extends Exception {

    public AttributeInvalidException(String message) {
        super(message);
    }

    public AttributeInvalidException(
            String message,
            Throwable cause
    ) {
        super(message, cause);
    }

}
