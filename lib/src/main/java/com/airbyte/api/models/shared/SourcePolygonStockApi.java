package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class SourcePolygonStockApi {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("adjusted")
    public String adjusted;
    public SourcePolygonStockApi withAdjusted(String adjusted) {
        this.adjusted = adjusted;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourcePolygonStockApiPolygonStockApiEnum airbyteSourceName;
    public SourcePolygonStockApi withAirbyteSourceName(SourcePolygonStockApiPolygonStockApiEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("apiKey")
    public String apiKey;
    public SourcePolygonStockApi withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("end_date")
    public LocalDate endDate;
    public SourcePolygonStockApi withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public SourcePolygonStockApi withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @JsonProperty("multiplier")
    public Long multiplier;
    public SourcePolygonStockApi withMultiplier(Long multiplier) {
        this.multiplier = multiplier;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    public String sort;
    public SourcePolygonStockApi withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourcePolygonStockApi withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("stocksTicker")
    public String stocksTicker;
    public SourcePolygonStockApi withStocksTicker(String stocksTicker) {
        this.stocksTicker = stocksTicker;
        return this;
    }
    
    @JsonProperty("timespan")
    public String timespan;
    public SourcePolygonStockApi withTimespan(String timespan) {
        this.timespan = timespan;
        return this;
    }
    
}
