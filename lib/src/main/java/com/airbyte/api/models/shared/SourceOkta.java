package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceOkta
 * The values required to configure the source.
**/
public class SourceOkta {
    @JsonProperty("airbyte-source-name")
    public SourceOktaOktaEnum airbyteSourceName;
    public SourceOkta withAirbyteSourceName(SourceOktaOktaEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceOkta withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domain")
    public String domain;
    public SourceOkta withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    public String startDate;
    public SourceOkta withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
