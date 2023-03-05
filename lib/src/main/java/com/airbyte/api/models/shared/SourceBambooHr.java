package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceBambooHr
 * The values required to configure the source.
**/
public class SourceBambooHr {
    @JsonProperty("airbyte-source-name")
    public SourceBambooHrBambooHrEnum airbyteSourceName;
    public SourceBambooHr withAirbyteSourceName(SourceBambooHrBambooHrEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceBambooHr withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_reports_fields")
    public String customReportsFields;
    public SourceBambooHr withCustomReportsFields(String customReportsFields) {
        this.customReportsFields = customReportsFields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_reports_include_default_fields")
    public Boolean customReportsIncludeDefaultFields;
    public SourceBambooHr withCustomReportsIncludeDefaultFields(Boolean customReportsIncludeDefaultFields) {
        this.customReportsIncludeDefaultFields = customReportsIncludeDefaultFields;
        return this;
    }
    
    @JsonProperty("subdomain")
    public String subdomain;
    public SourceBambooHr withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }
    
}
