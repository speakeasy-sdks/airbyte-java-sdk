package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class SourceSurveymonkey {
    @JsonProperty("airbyte-source-name")
    public SourceSurveymonkeySurveymonkeyEnum airbyteSourceName;
    public SourceSurveymonkey withAirbyteSourceName(SourceSurveymonkeySurveymonkeyEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public SourceSurveymonkeySurveyMonkeyAuthorizationMethod credentials;
    public SourceSurveymonkey withCredentials(SourceSurveymonkeySurveyMonkeyAuthorizationMethod credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("origin")
    public SourceSurveymonkeyOriginDatacenterOfTheSurveyMonkeyAccountEnum origin;
    public SourceSurveymonkey withOrigin(SourceSurveymonkeyOriginDatacenterOfTheSurveyMonkeyAccountEnum origin) {
        this.origin = origin;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceSurveymonkey withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("survey_ids")
    public String[] surveyIds;
    public SourceSurveymonkey withSurveyIds(String[] surveyIds) {
        this.surveyIds = surveyIds;
        return this;
    }
    
}
