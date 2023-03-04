package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceQualaroo {
    @JsonProperty("airbyte-source-name")
    public SourceQualarooQualarooEnum airbyteSourceName;
    public SourceQualaroo withAirbyteSourceName(SourceQualarooQualarooEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("key")
    public String key;
    public SourceQualaroo withKey(String key) {
        this.key = key;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceQualaroo withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("survey_ids")
    public String[] surveyIds;
    public SourceQualaroo withSurveyIds(String[] surveyIds) {
        this.surveyIds = surveyIds;
        return this;
    }
    
    @JsonProperty("token")
    public String token;
    public SourceQualaroo withToken(String token) {
        this.token = token;
        return this;
    }
    
}
