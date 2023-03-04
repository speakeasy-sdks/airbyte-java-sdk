package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class SourceExchangeRates {
    @JsonProperty("access_key")
    public String accessKey;
    public SourceExchangeRates withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceExchangeRatesExchangeRatesEnum airbyteSourceName;
    public SourceExchangeRates withAirbyteSourceName(SourceExchangeRatesExchangeRatesEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("base")
    public String base;
    public SourceExchangeRates withBase(String base) {
        this.base = base;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ignore_weekends")
    public Boolean ignoreWeekends;
    public SourceExchangeRates withIgnoreWeekends(Boolean ignoreWeekends) {
        this.ignoreWeekends = ignoreWeekends;
        return this;
    }
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceExchangeRates withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
