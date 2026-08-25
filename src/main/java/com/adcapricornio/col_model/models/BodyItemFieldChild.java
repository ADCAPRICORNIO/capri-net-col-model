package com.adcapricornio.col_model.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BodyItemFieldChild {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String buttonTheme;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String tooltip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String link;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cssStyle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cssClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String actionKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String actionData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isHtml;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isBadge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String badgeTheme;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String badgeIcon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String badgeColor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String badgeTextColor;
}
