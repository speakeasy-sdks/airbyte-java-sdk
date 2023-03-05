package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceShortio
 * The values required to configure the source.
**/
public class SourceShortio {
    @JsonProperty("airbyte-source-name")
    public SourceShortioShortioEnum airbyteSourceName;
    public SourceShortio withAirbyteSourceName(SourceShortioShortioEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("domain_id")
    public String domainId;
    public SourceShortio withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    
    @JsonProperty("secret_key")
    public String secretKey;
    public SourceShortio withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceShortio withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
