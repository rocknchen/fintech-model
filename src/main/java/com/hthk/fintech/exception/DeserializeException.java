package com.hthk.fintech.exception;

public class DeserializeException extends Exception {

    public DeserializeException(String message) {
        super(message);
    }

    public DeserializeException(
            String message,
            Throwable cause
    ) {
        super(message, cause);
    }

}
