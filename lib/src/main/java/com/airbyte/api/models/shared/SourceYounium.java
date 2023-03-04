package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceYounium {
    @JsonProperty("airbyte-source-name")
    public SourceYouniumYouniumEnum airbyteSourceName;
    public SourceYounium withAirbyteSourceName(SourceYouniumYouniumEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("legal_entity")
    public String legalEntity;
    public SourceYounium withLegalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
        return this;
    }
    
    @JsonProperty("password")
    public String password;
    public SourceYounium withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("playground")
    public Boolean playground;
    public SourceYounium withPlayground(Boolean playground) {
        this.playground = playground;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public SourceYounium withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
