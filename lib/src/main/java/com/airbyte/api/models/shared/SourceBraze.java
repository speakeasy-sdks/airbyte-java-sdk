package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourceBraze
 * The values required to configure the source.
**/
public class SourceBraze {
    @JsonProperty("airbyte-source-name")
    public SourceBrazeBrazeEnum airbyteSourceName;
    public SourceBraze withAirbyteSourceName(SourceBrazeBrazeEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceBraze withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceBraze withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("url")
    public String url;
    public SourceBraze withUrl(String url) {
        this.url = url;
        return this;
    }
    
}
