package com.adcapricornio.col_model.enums;

import lombok.Getter;

@Getter
public enum ColModelButtonThemes {

    BTN_PRIMARY("btn-primary"),
    BTN_SECONDARY("btn-secondary"),
    BTN_LIGHT("btn-light"),
    BTN_DARK("btn-dark"),
    BTN_INFO("btn-info"),
    BTN_WARNING("btn-warning"),
    BTN_DANGER("btn-danger"),
    BTN_SUCCESS("btn-success"),
    BTN_SOFT_PRIMARY("btn-soft-primary"),
    BTN_SOFT_SECONDARY("btn-soft-secondary"),
    BTN_SOFT_LIGHT("btn-soft-light"),
    BTN_SOFT_DARK("btn-soft-dark"),
    BTN_SOFT_INFO("btn-soft-info"),
    BTN_SOFT_WARNING("btn-soft-warning"),
    BTN_SOFT_DANGER("btn-soft-danger"),
    BTN_SOFT_SUCCESS("btn-soft-success");

    private final String value;

    ColModelButtonThemes(String value) {
        this.value = value;
    }

    public static ColModelButtonThemes fromString(String value) {
        for (ColModelButtonThemes theme : values()) {
            if (theme.value.equals(value)) {
                return theme;
            }
        }
        return null;
    }

}
