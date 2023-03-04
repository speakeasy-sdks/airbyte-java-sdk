package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceOrb {
    @JsonProperty("airbyte-source-name")
    public SourceOrbOrbEnum airbyteSourceName;
    public SourceOrb withAirbyteSourceName(SourceOrbOrbEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceOrb withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lookback_window_days")
    public Long lookbackWindowDays;
    public SourceOrb withLookbackWindowDays(Long lookbackWindowDays) {
        this.lookbackWindowDays = lookbackWindowDays;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("numeric_event_properties_keys")
    public String[] numericEventPropertiesKeys;
    public SourceOrb withNumericEventPropertiesKeys(String[] numericEventPropertiesKeys) {
        this.numericEventPropertiesKeys = numericEventPropertiesKeys;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("plan_id")
    public String planId;
    public SourceOrb withPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceOrb withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("string_event_properties_keys")
    public String[] stringEventPropertiesKeys;
    public SourceOrb withStringEventPropertiesKeys(String[] stringEventPropertiesKeys) {
        this.stringEventPropertiesKeys = stringEventPropertiesKeys;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subscription_usage_grouping_key")
    public String subscriptionUsageGroupingKey;
    public SourceOrb withSubscriptionUsageGroupingKey(String subscriptionUsageGroupingKey) {
        this.subscriptionUsageGroupingKey = subscriptionUsageGroupingKey;
        return this;
    }
    
}
