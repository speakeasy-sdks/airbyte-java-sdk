package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceZendeskTalk {
    @JsonProperty("airbyte-source-name")
    public SourceZendeskTalkZendeskTalkEnum airbyteSourceName;
    public SourceZendeskTalk withAirbyteSourceName(SourceZendeskTalkZendeskTalkEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceZendeskTalk withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceZendeskTalk withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("subdomain")
    public String subdomain;
    public SourceZendeskTalk withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }
    
}
