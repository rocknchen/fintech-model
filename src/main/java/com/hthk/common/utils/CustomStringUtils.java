package com.hthk.common.utils;

import org.apache.commons.collections.CollectionUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomStringUtils {

    public static boolean hasText(String value) {
        return value != null && !value.trim().equals("");
    }

    public static String buildWrapStr(List<?> list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return list.stream().map(t -> t.toString()).collect(Collectors.joining("\r\n"));
    }

    public static String replaceAll(String path, Map<String, String> replaceMap) {
        for (String key : replaceMap.keySet()) {
            path = path.replaceAll(key, replaceMap.get(key));
        }
        return path;
    }

}
