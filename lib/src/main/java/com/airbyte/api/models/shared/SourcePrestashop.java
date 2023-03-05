package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourcePrestashop
 * The values required to configure the source.
**/
public class SourcePrestashop {
    @JsonProperty("access_key")
    public String accessKey;
    public SourcePrestashop withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourcePrestashopPrestashopEnum airbyteSourceName;
    public SourcePrestashop withAirbyteSourceName(SourcePrestashopPrestashopEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourcePrestashop withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("url")
    public String url;
    public SourcePrestashop withUrl(String url) {
        this.url = url;
        return this;
    }
    
}
