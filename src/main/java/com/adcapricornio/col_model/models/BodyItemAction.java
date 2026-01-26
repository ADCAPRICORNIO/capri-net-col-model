package com.adcapricornio.col_model.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BodyItemAction {

    private String text;
    private String icon;
    private String iconText;
    private String tooltip;
    private String textColor;
    private String buttonTheme;
    private String link;
    private String downloadLink;
    private String actionKey;
    private String actionData;
    private String actionType;

    private Integer isHref;
    private Integer isDownloadable;
    private Integer isSelectable;

}
