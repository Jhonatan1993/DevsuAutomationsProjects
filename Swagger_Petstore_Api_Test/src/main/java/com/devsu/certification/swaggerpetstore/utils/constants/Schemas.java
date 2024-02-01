package com.devsu.certification.swaggerpetstore.utils.constants;

import lombok.Getter;

@Getter
public enum Schemas {
    JSON_SCHEMA("schemas/userDataSchema.json");
    private final String path;

    Schemas(String path) {
        this.path = path;
    }
}
