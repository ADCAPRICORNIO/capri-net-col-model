package com.adcapricornio.col_model.models.excel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Header {

    private String key;
    private String label;

    private Integer width;

    private String dataType;
    private String textAlign;

}
