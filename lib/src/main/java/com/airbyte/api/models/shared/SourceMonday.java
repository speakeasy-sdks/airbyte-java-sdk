package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMonday
 * The values required to configure the source.
**/
public class SourceMonday {
    @JsonProperty("airbyte-source-name")
    public SourceMondayMondayEnum airbyteSourceName;
    public SourceMonday withAirbyteSourceName(SourceMondayMondayEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceMonday withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
}
