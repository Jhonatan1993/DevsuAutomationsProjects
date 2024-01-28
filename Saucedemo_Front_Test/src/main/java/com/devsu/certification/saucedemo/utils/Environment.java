package com.devsu.certification.saucedemo.utils;


public class Environment {
    private String url;
    public Environment() {
        initializeEnvironment();
    }
    private void initializeEnvironment() {
        String env = System.getProperty("env");
        url = String.format("env.%s.homeUrl", env);
    }
    public String getUrl() {
        return url;
    }
}
