package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleDirectory
 * The values required to configure the source.
**/
public class SourceGoogleDirectory {
    @JsonProperty("airbyte-source-name")
    public SourceGoogleDirectoryGoogleDirectoryEnum airbyteSourceName;
    public SourceGoogleDirectory withAirbyteSourceName(SourceGoogleDirectoryGoogleDirectoryEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("credentials_json")
    public String credentialsJson;
    public SourceGoogleDirectory withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
    @JsonProperty("email")
    public String email;
    public SourceGoogleDirectory withEmail(String email) {
        this.email = email;
        return this;
    }
    
}
