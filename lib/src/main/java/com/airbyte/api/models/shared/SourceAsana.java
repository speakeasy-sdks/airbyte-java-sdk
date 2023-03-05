package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAsana
 * The values required to configure the source.
**/
public class SourceAsana {
    @JsonProperty("airbyte-source-name")
    public SourceAsanaAsanaEnum airbyteSourceName;
    public SourceAsana withAirbyteSourceName(SourceAsanaAsanaEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceAsana withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
}
