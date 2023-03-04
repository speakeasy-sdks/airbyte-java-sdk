package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceMarketo {
    @JsonProperty("airbyte-source-name")
    public SourceMarketoMarketoEnum airbyteSourceName;
    public SourceMarketo withAirbyteSourceName(SourceMarketoMarketoEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("client_id")
    public String clientId;
    public SourceMarketo withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceMarketo withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonProperty("domain_url")
    public String domainUrl;
    public SourceMarketo withDomainUrl(String domainUrl) {
        this.domainUrl = domainUrl;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceMarketo withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
