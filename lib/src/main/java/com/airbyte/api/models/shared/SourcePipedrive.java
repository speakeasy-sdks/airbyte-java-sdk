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
 * SourcePipedrive
 * The values required to configure the source.
**/
public class SourcePipedrive {
    @JsonProperty("airbyte-source-name")
    public SourcePipedrivePipedriveEnum airbyteSourceName;
    public SourcePipedrive withAirbyteSourceName(SourcePipedrivePipedriveEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authorization")
    public SourcePipedriveAPIKeyAuthentication authorization;
    public SourcePipedrive withAuthorization(SourcePipedriveAPIKeyAuthentication authorization) {
        this.authorization = authorization;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("replication_start_date")
    public OffsetDateTime replicationStartDate;
    public SourcePipedrive withReplicationStartDate(OffsetDateTime replicationStartDate) {
        this.replicationStartDate = replicationStartDate;
        return this;
    }
    
}
