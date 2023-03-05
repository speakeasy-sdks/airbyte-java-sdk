package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceRkiCovid
 * The values required to configure the source.
**/
public class SourceRkiCovid {
    @JsonProperty("airbyte-source-name")
    public SourceRkiCovidRkiCovidEnum airbyteSourceName;
    public SourceRkiCovid withAirbyteSourceName(SourceRkiCovidRkiCovidEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourceRkiCovid withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
