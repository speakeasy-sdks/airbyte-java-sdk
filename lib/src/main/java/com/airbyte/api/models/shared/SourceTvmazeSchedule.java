package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceTvmazeSchedule {
    @JsonProperty("airbyte-source-name")
    public SourceTvmazeScheduleTvmazeScheduleEnum airbyteSourceName;
    public SourceTvmazeSchedule withAirbyteSourceName(SourceTvmazeScheduleTvmazeScheduleEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("domestic_schedule_country_code")
    public String domesticScheduleCountryCode;
    public SourceTvmazeSchedule withDomesticScheduleCountryCode(String domesticScheduleCountryCode) {
        this.domesticScheduleCountryCode = domesticScheduleCountryCode;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public String endDate;
    public SourceTvmazeSchedule withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceTvmazeSchedule withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("web_schedule_country_code")
    public String webScheduleCountryCode;
    public SourceTvmazeSchedule withWebScheduleCountryCode(String webScheduleCountryCode) {
        this.webScheduleCountryCode = webScheduleCountryCode;
        return this;
    }
    
}
