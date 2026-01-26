package com.adcapricornio.col_model.enums;

import lombok.Getter;

@Getter
public enum ColModelIcons {

    BX_SHOW("bx bx-show"),
    BX_TRASH("bx bx-trash"),
    BX_EDIT("bx bx-edit"),
    BX_UPLOAD("bx bx-upload"),
    BX_DOWNLOAD("bx bx-download"),
    BX_SEND("bx bx-send"),
    BX_FOLDER_OPEN("bx bx-folder-open"),
    BX_BOOK_OPEN("bx bx-book-open"),
    BX_LINE_CHART("bx bx-line-chart"),
    BX_MAP("bx bx-map-alt"),
    BX_LOCK("bx bx-lock-alt"),
    BX_FILE("bx bx-file-blank"),
    BX_MAP_POINT("bx bx-map"),
    BXS_TRUCK("bx bxs-truck");

    private final String value;

    ColModelIcons(String value) {
        this.value = value;
    }

    public static ColModelIcons fromString(String value) {
        for (ColModelIcons theme : values()) {
            if (theme.value.equals(value)) {
                return theme;
            }
        }
        return null;
    }

}
