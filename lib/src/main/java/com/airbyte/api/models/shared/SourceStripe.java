package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceStripe {
    @JsonProperty("account_id")
    public String accountId;
    public SourceStripe withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceStripeStripeEnum airbyteSourceName;
    public SourceStripe withAirbyteSourceName(SourceStripeStripeEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceStripe withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lookback_window_days")
    public Long lookbackWindowDays;
    public SourceStripe withLookbackWindowDays(Long lookbackWindowDays) {
        this.lookbackWindowDays = lookbackWindowDays;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("slice_range")
    public Long sliceRange;
    public SourceStripe withSliceRange(Long sliceRange) {
        this.sliceRange = sliceRange;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceStripe withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
