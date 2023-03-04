package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceRetently {
    @JsonProperty("airbyte-source-name")
    public SourceRetentlyRetentlyEnum airbyteSourceName;
    public SourceRetently withAirbyteSourceName(SourceRetentlyRetentlyEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceRetently withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
}
