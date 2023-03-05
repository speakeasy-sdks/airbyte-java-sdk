package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePunkApi
 * The values required to configure the source.
**/
public class SourcePunkApi {
    @JsonProperty("airbyte-source-name")
    public SourcePunkApiPunkApiEnum airbyteSourceName;
    public SourcePunkApi withAirbyteSourceName(SourcePunkApiPunkApiEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("brewed_after")
    public String brewedAfter;
    public SourcePunkApi withBrewedAfter(String brewedAfter) {
        this.brewedAfter = brewedAfter;
        return this;
    }
    
    @JsonProperty("brewed_before")
    public String brewedBefore;
    public SourcePunkApi withBrewedBefore(String brewedBefore) {
        this.brewedBefore = brewedBefore;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public SourcePunkApi withId(String id) {
        this.id = id;
        return this;
    }
    
}
