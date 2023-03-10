package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceRetently
 * The values required to configure the source.
**/
public class SourceRetently {
    @JsonProperty("airbyte-source-name")
    public SourceRetentlyRetentlyEnum airbyteSourceName;
    public SourceRetently withAirbyteSourceName(SourceRetentlyRetentlyEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceRetently withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
}
