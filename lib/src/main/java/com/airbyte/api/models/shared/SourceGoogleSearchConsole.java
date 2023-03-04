package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceGoogleSearchConsole {
    @JsonProperty("airbyte-source-name")
    public SourceGoogleSearchConsoleGoogleSearchConsoleEnum airbyteSourceName;
    public SourceGoogleSearchConsole withAirbyteSourceName(SourceGoogleSearchConsoleGoogleSearchConsoleEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("authorization")
    public java.util.Map<String, Object> authorization;
    public SourceGoogleSearchConsole withAuthorization(java.util.Map<String, Object> authorization) {
        this.authorization = authorization;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_reports")
    public String customReports;
    public SourceGoogleSearchConsole withCustomReports(String customReports) {
        this.customReports = customReports;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public String endDate;
    public SourceGoogleSearchConsole withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonProperty("site_urls")
    public String[] siteUrls;
    public SourceGoogleSearchConsole withSiteUrls(String[] siteUrls) {
        this.siteUrls = siteUrls;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceGoogleSearchConsole withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
