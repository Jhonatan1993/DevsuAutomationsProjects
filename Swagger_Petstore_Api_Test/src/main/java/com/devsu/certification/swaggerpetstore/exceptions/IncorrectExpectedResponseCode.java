package com.devsu.certification.swaggerpetstore.exceptions;

public class IncorrectExpectedResponseCode extends AssertionError{
    public IncorrectExpectedResponseCode(String message, Throwable e) {
        super(message, e);
    }
}
