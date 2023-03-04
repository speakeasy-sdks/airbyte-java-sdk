package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class SourceKlaviyo {
    @JsonProperty("airbyte-source-name")
    public SourceKlaviyoKlaviyoEnum airbyteSourceName;
    public SourceKlaviyo withAirbyteSourceName(SourceKlaviyoKlaviyoEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceKlaviyo withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceKlaviyo withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
