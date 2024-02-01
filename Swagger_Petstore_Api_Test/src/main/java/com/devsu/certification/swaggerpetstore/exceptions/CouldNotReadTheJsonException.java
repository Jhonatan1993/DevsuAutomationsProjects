package com.devsu.certification.swaggerpetstore.exceptions;

public class CouldNotReadTheJsonException extends AssertionError{
    public CouldNotReadTheJsonException(String message, Throwable e) {
        super(message, e);
    }
}
