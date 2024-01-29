package com.devsu.certification.swaggerpetstore.utils;


public class Environment {
    private String url;
    public Environment() {
        initializeEnvironment();
    }
    private void initializeEnvironment() {
        String env = System.getProperty("env");
        url = String.format("api.%s.baseUrl", env);
    }
    public String getUrl() {
        return url;
    }
}
