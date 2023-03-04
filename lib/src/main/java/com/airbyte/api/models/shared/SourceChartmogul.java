package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class SourceChartmogul {
    @JsonProperty("airbyte-source-name")
    public SourceChartmogulChartmogulEnum airbyteSourceName;
    public SourceChartmogul withAirbyteSourceName(SourceChartmogulChartmogulEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceChartmogul withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("interval")
    public SourceChartmogulIntervalEnum interval;
    public SourceChartmogul withInterval(SourceChartmogulIntervalEnum interval) {
        this.interval = interval;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceChartmogul withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
