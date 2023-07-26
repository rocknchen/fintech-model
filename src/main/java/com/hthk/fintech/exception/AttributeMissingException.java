package com.hthk.fintech.exception;

public class AttributeMissingException extends AttributeInvalidException {

    public AttributeMissingException(String message) {
        super(message);
    }

    public AttributeMissingException(
            String message,
            Throwable cause
    ) {
        super(message, cause);
    }

}
