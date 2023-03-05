package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceConfigcat
 * The values required to configure the source.
**/
public class SourceConfigcat {
    @JsonProperty("airbyte-source-name")
    public SourceConfigcatConfigcatEnum airbyteSourceName;
    public SourceConfigcat withAirbyteSourceName(SourceConfigcatConfigcatEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("password")
    public String password;
    public SourceConfigcat withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("username")
    public String username;
    public SourceConfigcat withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
