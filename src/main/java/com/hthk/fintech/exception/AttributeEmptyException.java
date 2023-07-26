package com.hthk.fintech.exception;

public class AttributeEmptyException extends AttributeInvalidException {

    public AttributeEmptyException(String message) {
        super(message);
    }

    public AttributeEmptyException(
            String message,
            Throwable cause
    ) {
        super(message, cause);
    }

}
