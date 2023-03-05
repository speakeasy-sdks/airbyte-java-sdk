package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMetabase
 * The values required to configure the source.
**/
public class SourceMetabase {
    @JsonProperty("airbyte-source-name")
    public SourceMetabaseMetabaseEnum airbyteSourceName;
    public SourceMetabase withAirbyteSourceName(SourceMetabaseMetabaseEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("instance_api_url")
    public String instanceApiUrl;
    public SourceMetabase withInstanceApiUrl(String instanceApiUrl) {
        this.instanceApiUrl = instanceApiUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public SourceMetabase withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("session_token")
    public String sessionToken;
    public SourceMetabase withSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    public String username;
    public SourceMetabase withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
