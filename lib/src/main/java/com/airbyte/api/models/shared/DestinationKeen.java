package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationKeen {
    @JsonProperty("airbyte-destination-name")
    public DestinationKeenKeenEnum airbyteDestinationName;
    public DestinationKeen withAirbyteDestinationName(DestinationKeenKeenEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public DestinationKeen withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("infer_timestamp")
    public Boolean inferTimestamp;
    public DestinationKeen withInferTimestamp(Boolean inferTimestamp) {
        this.inferTimestamp = inferTimestamp;
        return this;
    }
    
    @JsonProperty("project_id")
    public String projectId;
    public DestinationKeen withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
}
