package com.hthk.common.utils;

import java.util.Map;

public class CustomStringUtils {

    public static boolean hasText(String value) {
        return value != null && !value.trim().equals("");
    }

    public static String replaceAll(String path, Map<String, String> replaceMap) {
        for (String key : replaceMap.keySet()) {
            path = path.replaceAll(key, replaceMap.get(key));
        }
        return path;
    }

}
