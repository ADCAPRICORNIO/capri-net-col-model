package com.adcapricornio.col_model;

import com.adcapricornio.col_model.helpers.StringHelper;
import com.adcapricornio.col_model.models.excel.Data;
import com.adcapricornio.col_model.models.excel.DataRow;
import com.adcapricornio.col_model.models.excel.Filter;
import com.adcapricornio.col_model.models.excel.Header;
import com.adcapricornio.col_model.validators.ColModelExcelHeaderValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ColModelExcel {

    public static List<Filter> buildFilters(List<Filter> filters) {
        List<Filter> response = new ArrayList<>();

        for (Filter filter : filters) {
            if (StringHelper.notBlank(filter.getValue())) response.add(filter);
        }

        return response;
    }

    public static Data buildData(List<ColModelExcelHeaderValidator.Header> headers, List<DataRow> rows) {
        List<Header> processedHeaders = headers.stream().map(h -> new Header(
                h.getKey(),
                h.getLabel().replaceAll("<BR>", " "),
                h.getWidthExcel(),
                h.getDataType(),
                h.getTextAlign()
        )).toList();

        Set<String> headerKeySet = processedHeaders.stream().map(Header::getKey).collect(Collectors.toSet());

        List<DataRow> processedRows = rows.stream().map(row -> new DataRow(
                row.getItems().stream().filter(item -> headerKeySet.contains(item.getKey())).toList(),
                row.getMetadata()
        )).toList();

        return new Data(processedHeaders, processedRows);
    }

}
