package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceSurveySparrow {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceSurveySparrow withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceSurveySparrowSurveySparrowEnum airbyteSourceName;
    public SourceSurveySparrow withAirbyteSourceName(SourceSurveySparrowSurveySparrowEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    public java.util.Map<String, Object> region;
    public SourceSurveySparrow withRegion(java.util.Map<String, Object> region) {
        this.region = region;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("survey_id")
    public Object[] surveyId;
    public SourceSurveySparrow withSurveyId(Object[] surveyId) {
        this.surveyId = surveyId;
        return this;
    }
    
}
