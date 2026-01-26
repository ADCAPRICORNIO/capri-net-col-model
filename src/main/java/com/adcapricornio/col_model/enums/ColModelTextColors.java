package com.adcapricornio.col_model.enums;

import lombok.Getter;

@Getter
public enum ColModelTextColors {

    TEXT_PRIMARY("text-primary"),
    TEXT_SECONDARY("text-secondary"),
    TEXT_LIGHT("text-light"),
    TEXT_DARK("text-dark"),
    TEXT_INFO("text-info"),
    TEXT_WARNING("text-warning"),
    TEXT_DANGER("text-danger"),
    TEXT_SUCCESS("text-success");

    private final String value;

    ColModelTextColors(String value) {
        this.value = value;
    }

    public static ColModelTextColors fromString(String value) {
        for (ColModelTextColors theme : values()) {
            if (theme.value.equals(value)) {
                return theme;
            }
        }
        return null;
    }

}
