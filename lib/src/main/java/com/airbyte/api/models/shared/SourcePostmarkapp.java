package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourcePostmarkapp {
    @JsonProperty("X-Postmark-Account-Token")
    public String xPostmarkAccountToken;
    public SourcePostmarkapp withXPostmarkAccountToken(String xPostmarkAccountToken) {
        this.xPostmarkAccountToken = xPostmarkAccountToken;
        return this;
    }
    
    @JsonProperty("X-Postmark-Server-Token")
    public String xPostmarkServerToken;
    public SourcePostmarkapp withXPostmarkServerToken(String xPostmarkServerToken) {
        this.xPostmarkServerToken = xPostmarkServerToken;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourcePostmarkappPostmarkappEnum airbyteSourceName;
    public SourcePostmarkapp withAirbyteSourceName(SourcePostmarkappPostmarkappEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
}
