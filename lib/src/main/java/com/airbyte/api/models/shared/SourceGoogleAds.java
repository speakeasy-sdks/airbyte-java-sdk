package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleAds
 * The values required to configure the source.
**/
public class SourceGoogleAds {
    @JsonProperty("airbyte-source-name")
    public SourceGoogleAdsGoogleAdsEnum airbyteSourceName;
    public SourceGoogleAds withAirbyteSourceName(SourceGoogleAdsGoogleAdsEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("conversion_window_days")
    public Long conversionWindowDays;
    public SourceGoogleAds withConversionWindowDays(Long conversionWindowDays) {
        this.conversionWindowDays = conversionWindowDays;
        return this;
    }
    
    @JsonProperty("credentials")
    public SourceGoogleAdsGoogleCredentials credentials;
    public SourceGoogleAds withCredentials(SourceGoogleAdsGoogleCredentials credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_queries")
    public SourceGoogleAdsCustomQueries[] customQueries;
    public SourceGoogleAds withCustomQueries(SourceGoogleAdsCustomQueries[] customQueries) {
        this.customQueries = customQueries;
        return this;
    }
    
    @JsonProperty("customer_id")
    public String customerId;
    public SourceGoogleAds withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public String endDate;
    public SourceGoogleAds withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("login_customer_id")
    public String loginCustomerId;
    public SourceGoogleAds withLoginCustomerId(String loginCustomerId) {
        this.loginCustomerId = loginCustomerId;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceGoogleAds withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
