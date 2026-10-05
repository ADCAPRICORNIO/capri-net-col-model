package com.adcapricornio.col_model.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Footer {

    private String key;
    private String label;

    private Object content;
    private String textAlign;
    private String textColor;
    private Integer isHtml;

}
