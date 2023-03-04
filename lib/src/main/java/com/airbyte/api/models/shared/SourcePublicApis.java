package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourcePublicApis {
    @JsonProperty("airbyte-source-name")
    public SourcePublicApisPublicApisEnum airbyteSourceName;
    public SourcePublicApis withAirbyteSourceName(SourcePublicApisPublicApisEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
}
