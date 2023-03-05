package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceZenloop
 * The values required to configure the source.
**/
public class SourceZenloop {
    @JsonProperty("airbyte-source-name")
    public SourceZenloopZenloopEnum airbyteSourceName;
    public SourceZenloop withAirbyteSourceName(SourceZenloopZenloopEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_token")
    public String apiToken;
    public SourceZenloop withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("date_from")
    public String dateFrom;
    public SourceZenloop withDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("survey_group_id")
    public String surveyGroupId;
    public SourceZenloop withSurveyGroupId(String surveyGroupId) {
        this.surveyGroupId = surveyGroupId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("survey_id")
    public String surveyId;
    public SourceZenloop withSurveyId(String surveyId) {
        this.surveyId = surveyId;
        return this;
    }
    
}
