package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceIterable
 * The values required to configure the source.
**/
public class SourceIterable {
    @JsonProperty("airbyte-source-name")
    public SourceIterableIterableEnum airbyteSourceName;
    public SourceIterable withAirbyteSourceName(SourceIterableIterableEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceIterable withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceIterable withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
