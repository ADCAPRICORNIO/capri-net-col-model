package com.adcapricornio.col_model.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BodyItemField {

    private String key;

    private Object content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String buttonTheme;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String tooltip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String link;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cssClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String actionKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isHtml;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isAction;

}
