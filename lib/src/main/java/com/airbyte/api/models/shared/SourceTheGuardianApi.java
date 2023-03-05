package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceTheGuardianApi
 * The values required to configure the source.
**/
public class SourceTheGuardianApi {
    @JsonProperty("airbyte-source-name")
    public SourceTheGuardianApiTheGuardianApiEnum airbyteSourceName;
    public SourceTheGuardianApi withAirbyteSourceName(SourceTheGuardianApiTheGuardianApiEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceTheGuardianApi withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public String endDate;
    public SourceTheGuardianApi withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query")
    public String query;
    public SourceTheGuardianApi withQuery(String query) {
        this.query = query;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("section")
    public String section;
    public SourceTheGuardianApi withSection(String section) {
        this.section = section;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceTheGuardianApi withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    public String tag;
    public SourceTheGuardianApi withTag(String tag) {
        this.tag = tag;
        return this;
    }
    
}
