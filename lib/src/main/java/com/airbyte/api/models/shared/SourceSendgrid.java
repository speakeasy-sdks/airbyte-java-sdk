package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class SourceSendgrid {
    @JsonProperty("airbyte-source-name")
    public SourceSendgridSendgridEnum airbyteSourceName;
    public SourceSendgrid withAirbyteSourceName(SourceSendgridSendgridEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("apikey")
    public String apikey;
    public SourceSendgrid withApikey(String apikey) {
        this.apikey = apikey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_time")
    public OffsetDateTime startTime;
    public SourceSendgrid withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }
    
}
