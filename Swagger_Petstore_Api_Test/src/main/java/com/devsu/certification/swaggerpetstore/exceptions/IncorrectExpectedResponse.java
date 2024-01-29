package com.devsu.certification.swaggerpetstore.exceptions;

public class IncorrectExpectedResponse extends AssertionError{
    public IncorrectExpectedResponse(String message, Throwable e) {
        super(message, e);
    }
}
