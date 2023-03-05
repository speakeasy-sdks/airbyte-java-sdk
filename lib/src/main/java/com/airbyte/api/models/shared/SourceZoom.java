package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceZoom
 * The values required to configure the source.
**/
public class SourceZoom {
    @JsonProperty("airbyte-source-name")
    public SourceZoomZoomEnum airbyteSourceName;
    public SourceZoom withAirbyteSourceName(SourceZoomZoomEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("jwt_token")
    public String jwtToken;
    public SourceZoom withJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    
}
