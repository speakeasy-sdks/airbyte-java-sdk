package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceInstagram
 * The values required to configure the source.
**/
public class SourceInstagram {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceInstagram withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceInstagramInstagramEnum airbyteSourceName;
    public SourceInstagram withAirbyteSourceName(SourceInstagramInstagramEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceInstagram withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
