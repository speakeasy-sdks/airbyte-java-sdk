package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceTiktokMarketing
 * The values required to configure the source.
**/
public class SourceTiktokMarketing {
    @JsonProperty("airbyte-source-name")
    public SourceTiktokMarketingTiktokMarketingEnum airbyteSourceName;
    public SourceTiktokMarketing withAirbyteSourceName(SourceTiktokMarketingTiktokMarketingEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceTiktokMarketing withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public String endDate;
    public SourceTiktokMarketing withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("report_granularity")
    public SourceTiktokMarketingReportAggregationGranularityEnum reportGranularity;
    public SourceTiktokMarketing withReportGranularity(SourceTiktokMarketingReportAggregationGranularityEnum reportGranularity) {
        this.reportGranularity = reportGranularity;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    public String startDate;
    public SourceTiktokMarketing withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
