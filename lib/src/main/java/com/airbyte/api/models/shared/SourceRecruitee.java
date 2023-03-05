package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceRecruitee
 * The values required to configure the source.
**/
public class SourceRecruitee {
    @JsonProperty("airbyte-source-name")
    public SourceRecruiteeRecruiteeEnum airbyteSourceName;
    public SourceRecruitee withAirbyteSourceName(SourceRecruiteeRecruiteeEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceRecruitee withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("company_id")
    public Long companyId;
    public SourceRecruitee withCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    
}
