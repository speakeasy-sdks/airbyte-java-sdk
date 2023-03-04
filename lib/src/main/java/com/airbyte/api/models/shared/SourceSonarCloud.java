package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class SourceSonarCloud {
    @JsonProperty("airbyte-source-name")
    public SourceSonarCloudSonarCloudEnum airbyteSourceName;
    public SourceSonarCloud withAirbyteSourceName(SourceSonarCloudSonarCloudEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("component_keys")
    public Object[] componentKeys;
    public SourceSonarCloud withComponentKeys(Object[] componentKeys) {
        this.componentKeys = componentKeys;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("end_date")
    public LocalDate endDate;
    public SourceSonarCloud withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonProperty("organization")
    public String organization;
    public SourceSonarCloud withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceSonarCloud withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("user_token")
    public String userToken;
    public SourceSonarCloud withUserToken(String userToken) {
        this.userToken = userToken;
        return this;
    }
    
}
