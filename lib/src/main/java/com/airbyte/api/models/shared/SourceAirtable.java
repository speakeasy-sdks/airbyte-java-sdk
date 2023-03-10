package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAirtable
 * The values required to configure the source.
**/
public class SourceAirtable {
    @JsonProperty("airbyte-source-name")
    public SourceAirtableAirtableEnum airbyteSourceName;
    public SourceAirtable withAirbyteSourceName(SourceAirtableAirtableEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceAirtable withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
}
