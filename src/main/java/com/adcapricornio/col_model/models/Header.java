package com.adcapricornio.col_model.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Header {

    private String key;
    private String label;

    private Integer width;
    private Integer widthExcel;

    private Integer order;
    private String dataType;
    private String textColor;
    private String textAlign;

    private Integer isHidden;
    private Integer isHtml;
    private Integer isSticky;

}
