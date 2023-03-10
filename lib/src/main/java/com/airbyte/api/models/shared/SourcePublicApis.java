package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePublicApis
 * The values required to configure the source.
**/
public class SourcePublicApis {
    @JsonProperty("airbyte-source-name")
    public SourcePublicApisPublicApisEnum airbyteSourceName;
    public SourcePublicApis withAirbyteSourceName(SourcePublicApisPublicApisEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
}
