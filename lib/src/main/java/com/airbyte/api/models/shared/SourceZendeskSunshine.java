package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceZendeskSunshine
 * The values required to configure the source.
**/
public class SourceZendeskSunshine {
    @JsonProperty("airbyte-source-name")
    public SourceZendeskSunshineZendeskSunshineEnum airbyteSourceName;
    public SourceZendeskSunshine withAirbyteSourceName(SourceZendeskSunshineZendeskSunshineEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceZendeskSunshine withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceZendeskSunshine withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("subdomain")
    public String subdomain;
    public SourceZendeskSunshine withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }
    
}
