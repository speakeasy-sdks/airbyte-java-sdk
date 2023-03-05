package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceTwilioTaskrouter
 * The values required to configure the source.
**/
public class SourceTwilioTaskrouter {
    @JsonProperty("account_sid")
    public String accountSid;
    public SourceTwilioTaskrouter withAccountSid(String accountSid) {
        this.accountSid = accountSid;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceTwilioTaskrouterTwilioTaskrouterEnum airbyteSourceName;
    public SourceTwilioTaskrouter withAirbyteSourceName(SourceTwilioTaskrouterTwilioTaskrouterEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("auth_token")
    public String authToken;
    public SourceTwilioTaskrouter withAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    
}
