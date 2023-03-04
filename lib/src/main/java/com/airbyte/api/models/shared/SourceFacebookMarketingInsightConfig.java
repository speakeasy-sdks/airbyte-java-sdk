package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceFacebookMarketingInsightConfig
 * Config for custom insights
**/
public class SourceFacebookMarketingInsightConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("action_breakdowns")
    public Object[] actionBreakdowns;
    public SourceFacebookMarketingInsightConfig withActionBreakdowns(Object[] actionBreakdowns) {
        this.actionBreakdowns = actionBreakdowns;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("breakdowns")
    public Object[] breakdowns;
    public SourceFacebookMarketingInsightConfig withBreakdowns(Object[] breakdowns) {
        this.breakdowns = breakdowns;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("end_date")
    public OffsetDateTime endDate;
    public SourceFacebookMarketingInsightConfig withEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    public Object[] fields;
    public SourceFacebookMarketingInsightConfig withFields(Object[] fields) {
        this.fields = fields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("insights_lookback_window")
    public Long insightsLookbackWindow;
    public SourceFacebookMarketingInsightConfig withInsightsLookbackWindow(Long insightsLookbackWindow) {
        this.insightsLookbackWindow = insightsLookbackWindow;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public SourceFacebookMarketingInsightConfig withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceFacebookMarketingInsightConfig withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("time_increment")
    public Long timeIncrement;
    public SourceFacebookMarketingInsightConfig withTimeIncrement(Long timeIncrement) {
        this.timeIncrement = timeIncrement;
        return this;
    }
    
}
