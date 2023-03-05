package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourceGoogleAnalyticsDataApi
 * The values required to configure the source.
**/
public class SourceGoogleAnalyticsDataApi {
    @JsonProperty("airbyte-source-name")
    public SourceGoogleAnalyticsDataApiGoogleAnalyticsDataApiEnum airbyteSourceName;
    public SourceGoogleAnalyticsDataApi withAirbyteSourceName(SourceGoogleAnalyticsDataApiGoogleAnalyticsDataApiEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceGoogleAnalyticsDataApi withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_reports")
    public String customReports;
    public SourceGoogleAnalyticsDataApi withCustomReports(String customReports) {
        this.customReports = customReports;
        return this;
    }
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("date_ranges_start_date")
    public LocalDate dateRangesStartDate;
    public SourceGoogleAnalyticsDataApi withDateRangesStartDate(LocalDate dateRangesStartDate) {
        this.dateRangesStartDate = dateRangesStartDate;
        return this;
    }
    
    @JsonProperty("property_id")
    public String propertyId;
    public SourceGoogleAnalyticsDataApi withPropertyId(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("window_in_days")
    public Long windowInDays;
    public SourceGoogleAnalyticsDataApi withWindowInDays(Long windowInDays) {
        this.windowInDays = windowInDays;
        return this;
    }
    
}
