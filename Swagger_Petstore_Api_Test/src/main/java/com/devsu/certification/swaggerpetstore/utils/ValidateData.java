package com.devsu.certification.swaggerpetstore.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

public class ValidateData {
    private ValidateData() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean validateUser(Path filepath, Map<String, String> testData) throws IOException {
        boolean result = false;
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(filepath.toFile());
        if (rootNode.get("username").asText().equals(testData.get("username"))) {
            result = true;
        }
        if (rootNode.get("firstName").asText().equals(testData.get("firstName"))) {
            result = true;
        }
        if (rootNode.get("lastName").asText().equals(testData.get("lastName"))) {
            result = true;
        }
        if (rootNode.get("email").asText().equals(testData.get("email"))) {
            result = true;
        }
        if (rootNode.get("password").asText().equals(testData.get("password"))) {
            result = true;
        }
        if (rootNode.get("phone").asText().equals(testData.get("phone"))) {
            result = true;
        }
        if (rootNode.get("userStatus").asText().equals(testData.get("userStatus"))) {
            result = true;
        }

        return result;
    }


}
