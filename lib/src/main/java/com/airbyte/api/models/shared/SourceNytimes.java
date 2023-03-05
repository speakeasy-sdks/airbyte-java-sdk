package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourceNytimes
 * The values required to configure the source.
**/
public class SourceNytimes {
    @JsonProperty("airbyte-source-name")
    public SourceNytimesNytimesEnum airbyteSourceName;
    public SourceNytimes withAirbyteSourceName(SourceNytimesNytimesEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceNytimes withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("end_date")
    public LocalDate endDate;
    public SourceNytimes withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonProperty("period")
    public Long period;
    public SourceNytimes withPeriod(Long period) {
        this.period = period;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("share_type")
    public SourceNytimesShareTypeUsedForMostPopularSharedStreamEnum shareType;
    public SourceNytimes withShareType(SourceNytimesShareTypeUsedForMostPopularSharedStreamEnum shareType) {
        this.shareType = shareType;
        return this;
    }
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceNytimes withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
