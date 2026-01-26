package com.adcapricornio.col_model.helpers;

public class StringHelper {

    public static boolean notBlank(String value) {
        if (value == null) return false;
        return !value.isEmpty();
    }

}
