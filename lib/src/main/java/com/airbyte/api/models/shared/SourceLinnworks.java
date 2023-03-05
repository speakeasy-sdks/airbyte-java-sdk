package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceLinnworks
 * The values required to configure the source.
**/
public class SourceLinnworks {
    @JsonProperty("airbyte-source-name")
    public SourceLinnworksLinnworksEnum airbyteSourceName;
    public SourceLinnworks withAirbyteSourceName(SourceLinnworksLinnworksEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("application_id")
    public String applicationId;
    public SourceLinnworks withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    
    @JsonProperty("application_secret")
    public String applicationSecret;
    public SourceLinnworks withApplicationSecret(String applicationSecret) {
        this.applicationSecret = applicationSecret;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceLinnworks withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("token")
    public String token;
    public SourceLinnworks withToken(String token) {
        this.token = token;
        return this;
    }
    
}
