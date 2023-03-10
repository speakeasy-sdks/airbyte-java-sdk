package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSurveySparrowRegionGlobalAccount
 * Is your account location is EU based? If yes, the base url to retrieve data will be different.
**/
public class SourceSurveySparrowRegionGlobalAccount {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url_base")
    public SourceSurveySparrowRegionGlobalAccountUrlBaseEnum urlBase;
    public SourceSurveySparrowRegionGlobalAccount withUrlBase(SourceSurveySparrowRegionGlobalAccountUrlBaseEnum urlBase) {
        this.urlBase = urlBase;
        return this;
    }
    
}
