package com.devsu.certification.saucedemo.models;

import java.util.HashMap;
import java.util.Map;

public class TestData {
    private static Map<String, Object> map = new HashMap<>();
    private TestData() {
    }

    public static Map<String, Object> getData() {
        return map;
    }

    public static void setData(Map<String, Object> dataPrueba) {
        if (map.isEmpty()) {
            map = dataPrueba;
        } else {
            map.putAll(dataPrueba);
        }
    }

    public static void setDataPruebaValue(String key, Object value) {
        map.put(key, value);
    }
}
