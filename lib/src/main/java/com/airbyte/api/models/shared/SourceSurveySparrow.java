package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSurveySparrow
 * The values required to configure the source.
**/
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
    public Object region;
    public SourceSurveySparrow withRegion(Object region) {
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
