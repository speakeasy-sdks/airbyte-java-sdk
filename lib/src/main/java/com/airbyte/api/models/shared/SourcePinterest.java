package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePinterest
 * The values required to configure the source.
**/
public class SourcePinterest {
    @JsonProperty("airbyte-source-name")
    public SourcePinterestPinterestEnum airbyteSourceName;
    public SourcePinterest withAirbyteSourceName(SourcePinterestPinterestEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourcePinterest withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("start_date")
    public String startDate;
    public SourcePinterest withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public SourcePinterestStatusEnum[] status;
    public SourcePinterest withStatus(SourcePinterestStatusEnum[] status) {
        this.status = status;
        return this;
    }
    
}
