package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceZendeskSupport {
    @JsonProperty("airbyte-source-name")
    public SourceZendeskSupportZendeskSupportEnum airbyteSourceName;
    public SourceZendeskSupport withAirbyteSourceName(SourceZendeskSupportZendeskSupportEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceZendeskSupport withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ignore_pagination")
    public Boolean ignorePagination;
    public SourceZendeskSupport withIgnorePagination(Boolean ignorePagination) {
        this.ignorePagination = ignorePagination;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceZendeskSupport withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("subdomain")
    public String subdomain;
    public SourceZendeskSupport withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }
    
}
