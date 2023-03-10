package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourcePolygonStockApiPolygonStockApiEnum {
    POLYGON_STOCK_API("polygon-stock-api");

    @JsonValue
    public final String value;

    private SourcePolygonStockApiPolygonStockApiEnum(String value) {
        this.value = value;
    }
}
