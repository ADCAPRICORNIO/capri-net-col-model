package com.adcapricornio.col_model.enums;

import lombok.Getter;

@Getter
public enum DataTypes {

    STRING("S"),
    INTEGER("I"),
    DOUBLE("D"),
    DATE("DD"),
    DATETIME("DT");

    private final String value;

    DataTypes(String value) {
        this.value = value;
    }
}
