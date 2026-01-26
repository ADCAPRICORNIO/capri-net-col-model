package com.adcapricornio.col_model;


import com.adcapricornio.col_model.models.BodyItem;
import com.adcapricornio.col_model.models.Header;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public record ColModel(List<Header> header, List<BodyItem> items) {

    public ColModel(List<Header> header, List<BodyItem> items) {
        this.header = List.copyOf(header != null ? header : Collections.emptyList());
        this.items = List.copyOf(items != null ? items : Collections.emptyList());
    }

    public static class ColModelBuilder {
        private List<BodyItem> items = Collections.emptyList();
        private List<Header> headers = Collections.emptyList();

        public ColModelBuilder items(List<BodyItem> items) {
            this.items = items != null ? new ArrayList<>(items) : Collections.emptyList();
            return this;
        }

        public ColModelBuilder headers(List<Header> headers) {
            this.headers = headers != null ? new ArrayList<>(headers) : Collections.emptyList();
            return this;
        }

        public ColModel build() {
            return new ColModel(headers, items);
        }
    }

    public static ColModelBuilder builder() {
        return new ColModelBuilder();
    }

}
