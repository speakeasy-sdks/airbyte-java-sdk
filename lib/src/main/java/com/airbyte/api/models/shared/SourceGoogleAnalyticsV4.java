package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleAnalyticsV4
 * The values required to configure the source.
**/
public class SourceGoogleAnalyticsV4 {
    @JsonProperty("airbyte-source-name")
    public SourceGoogleAnalyticsV4GoogleAnalyticsV4Enum airbyteSourceName;
    public SourceGoogleAnalyticsV4 withAirbyteSourceName(SourceGoogleAnalyticsV4GoogleAnalyticsV4Enum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceGoogleAnalyticsV4 withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_reports")
    public String customReports;
    public SourceGoogleAnalyticsV4 withCustomReports(String customReports) {
        this.customReports = customReports;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceGoogleAnalyticsV4 withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("view_id")
    public String viewId;
    public SourceGoogleAnalyticsV4 withViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("window_in_days")
    public Long windowInDays;
    public SourceGoogleAnalyticsV4 withWindowInDays(Long windowInDays) {
        this.windowInDays = windowInDays;
        return this;
    }
    
}
