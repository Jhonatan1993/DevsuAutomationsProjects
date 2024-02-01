package com.devsu.certification.swaggerpetstore.exceptions;

public class SchemaInvalid extends AssertionError{
    public SchemaInvalid(String message, Throwable e) {
        super(message, e);
    }
}
