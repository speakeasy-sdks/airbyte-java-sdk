package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourceLinkedinAds
 * The values required to configure the source.
**/
public class SourceLinkedinAds {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_ids")
    public Long[] accountIds;
    public SourceLinkedinAds withAccountIds(Long[] accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceLinkedinAdsLinkedinAdsEnum airbyteSourceName;
    public SourceLinkedinAds withAirbyteSourceName(SourceLinkedinAdsLinkedinAdsEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceLinkedinAds withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceLinkedinAds withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
