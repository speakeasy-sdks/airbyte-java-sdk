package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceAmplitude
 * The values required to configure the source.
**/
public class SourceAmplitude {
    @JsonProperty("airbyte-source-name")
    public SourceAmplitudeAmplitudeEnum airbyteSourceName;
    public SourceAmplitude withAirbyteSourceName(SourceAmplitudeAmplitudeEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceAmplitude withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data_region")
    public SourceAmplitudeDataRegionEnum dataRegion;
    public SourceAmplitude withDataRegion(SourceAmplitudeDataRegionEnum dataRegion) {
        this.dataRegion = dataRegion;
        return this;
    }
    
    @JsonProperty("secret_key")
    public String secretKey;
    public SourceAmplitude withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceAmplitude withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
