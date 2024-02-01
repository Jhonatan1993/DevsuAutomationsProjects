package com.devsu.certification.swaggerpetstore.utils;

import com.devsu.certification.swaggerpetstore.exceptions.CouldNotReadTheJsonException;
import com.google.gson.Gson;
import lombok.SneakyThrows;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UtilRest {
    private UtilRest() {
    }

    public static <T> String getJson(T object) {
        final Gson gson = new Gson();
        return gson.toJson(object);
    }

    @SneakyThrows
    public static String readJsonFromFile(String path) {

        String payload;
        try {
            payload = new String(Files.readAllBytes(Paths.get(path)));

        } catch (IOException e) {

            throw new CouldNotReadTheJsonException("Could not read json from file", e);
        }
        return payload;
    }
}
