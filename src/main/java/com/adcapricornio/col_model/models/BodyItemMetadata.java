package com.adcapricornio.col_model.models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BodyItemMetadata {

    private String rowClass;

    private Integer isFooter;
    private Integer isSelectable;

}
