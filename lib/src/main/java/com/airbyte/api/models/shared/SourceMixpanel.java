package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceMixpanel {
    @JsonProperty("airbyte-source-name")
    public SourceMixpanelMixpanelEnum airbyteSourceName;
    public SourceMixpanel withAirbyteSourceName(SourceMixpanelMixpanelEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attribution_window")
    public Long attributionWindow;
    public SourceMixpanel withAttributionWindow(Long attributionWindow) {
        this.attributionWindow = attributionWindow;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public java.util.Map<String, Object> credentials;
    public SourceMixpanel withCredentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("date_window_size")
    public Long dateWindowSize;
    public SourceMixpanel withDateWindowSize(Long dateWindowSize) {
        this.dateWindowSize = dateWindowSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public String endDate;
    public SourceMixpanel withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project_id")
    public Long projectId;
    public SourceMixpanel withProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project_timezone")
    public String projectTimezone;
    public SourceMixpanel withProjectTimezone(String projectTimezone) {
        this.projectTimezone = projectTimezone;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    public SourceMixpanelRegionEnum region;
    public SourceMixpanel withRegion(SourceMixpanelRegionEnum region) {
        this.region = region;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("select_properties_by_default")
    public Boolean selectPropertiesByDefault;
    public SourceMixpanel withSelectPropertiesByDefault(Boolean selectPropertiesByDefault) {
        this.selectPropertiesByDefault = selectPropertiesByDefault;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    public String startDate;
    public SourceMixpanel withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
