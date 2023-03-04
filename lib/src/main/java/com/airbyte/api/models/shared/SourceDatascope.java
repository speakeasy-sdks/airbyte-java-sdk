package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceDatascope {
    @JsonProperty("airbyte-source-name")
    public SourceDatascopeDatascopeEnum airbyteSourceName;
    public SourceDatascope withAirbyteSourceName(SourceDatascopeDatascopeEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceDatascope withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceDatascope withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
