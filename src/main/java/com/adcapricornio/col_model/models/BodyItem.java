package com.adcapricornio.col_model.models;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class BodyItem {

    private Integer index;
    private Object item;
    private BodyItemMetadata metadata;
    private List<BodyItemField> fields;
    private List<BodyItemAction> actions;

}
