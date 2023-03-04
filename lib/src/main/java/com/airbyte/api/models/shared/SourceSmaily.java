package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceSmaily {
    @JsonProperty("airbyte-source-name")
    public SourceSmailySmailyEnum airbyteSourceName;
    public SourceSmaily withAirbyteSourceName(SourceSmailySmailyEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_password")
    public String apiPassword;
    public SourceSmaily withApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
        return this;
    }
    
    @JsonProperty("api_subdomain")
    public String apiSubdomain;
    public SourceSmaily withApiSubdomain(String apiSubdomain) {
        this.apiSubdomain = apiSubdomain;
        return this;
    }
    
    @JsonProperty("api_username")
    public String apiUsername;
    public SourceSmaily withApiUsername(String apiUsername) {
        this.apiUsername = apiUsername;
        return this;
    }
    
}
