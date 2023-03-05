package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceKlarna
 * The values required to configure the source.
**/
public class SourceKlarna {
    @JsonProperty("airbyte-source-name")
    public SourceKlarnaKlarnaEnum airbyteSourceName;
    public SourceKlarna withAirbyteSourceName(SourceKlarnaKlarnaEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("password")
    public String password;
    public SourceKlarna withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("playground")
    public Boolean playground;
    public SourceKlarna withPlayground(Boolean playground) {
        this.playground = playground;
        return this;
    }
    
    @JsonProperty("region")
    public SourceKlarnaRegionEnum region;
    public SourceKlarna withRegion(SourceKlarnaRegionEnum region) {
        this.region = region;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public SourceKlarna withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
