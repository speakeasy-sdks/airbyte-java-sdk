package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceDelighted
 * The values required to configure the source.
**/
public class SourceDelighted {
    @JsonProperty("airbyte-source-name")
    public SourceDelightedDelightedEnum airbyteSourceName;
    public SourceDelighted withAirbyteSourceName(SourceDelightedDelightedEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceDelighted withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("since")
    public OffsetDateTime since;
    public SourceDelighted withSince(OffsetDateTime since) {
        this.since = since;
        return this;
    }
    
}
