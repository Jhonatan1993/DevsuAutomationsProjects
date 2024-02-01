package com.devsu.certification.swaggerpetstore.utils.constants;

import lombok.Getter;
@Getter
public enum MessageForFailures {
    MESSAGE_WRONG_RESPONSE_CODE_200("200 response code was expected"),
    MESSAGE_SCHEMA_INVALID("The structure of the response body is not correct");

    private final String message;

    MessageForFailures(String message) {
        this.message = message;
    }
}
