package com.adcapricornio.col_model.validators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ColModelExcelHeaderValidator {

    private List<Header> headers;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Header {

        private String key;
        private String label;

        private Integer widthExcel;

        private String dataType;
        private String textAlign;

    }

}
