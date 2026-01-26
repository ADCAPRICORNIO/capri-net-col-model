package com.adcapricornio.col_model.validators;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ColModelExcelHeaderValidator {

    private List<Header> headers;

    @Getter
    @Setter
    public static class Header {

        private String key;
        private String label;

        private Integer widthExcel;

        private String dataType;
        private String textAlign;

    }

}
