package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSurveySparrowRegionEUBasedAccount
 * Is your account location is EU based? If yes, the base url to retrieve data will be different.
**/
public class SourceSurveySparrowRegionEUBasedAccount {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url_base")
    public SourceSurveySparrowRegionEUBasedAccountUrlBaseEnum urlBase;
    public SourceSurveySparrowRegionEUBasedAccount withUrlBase(SourceSurveySparrowRegionEUBasedAccountUrlBaseEnum urlBase) {
        this.urlBase = urlBase;
        return this;
    }
    
}
