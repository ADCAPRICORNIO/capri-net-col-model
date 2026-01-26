package com.adcapricornio.col_model.models.excel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Data {

    private List<Header> headers;
    private List<DataRow> rows;

}
