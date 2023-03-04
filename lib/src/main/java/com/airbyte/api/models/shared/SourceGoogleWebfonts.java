package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceGoogleWebfonts {
    @JsonProperty("airbyte-source-name")
    public SourceGoogleWebfontsGoogleWebfontsEnum airbyteSourceName;
    public SourceGoogleWebfonts withAirbyteSourceName(SourceGoogleWebfontsGoogleWebfontsEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("alt")
    public String alt;
    public SourceGoogleWebfonts withAlt(String alt) {
        this.alt = alt;
        return this;
    }
    
    @JsonProperty("api_key")
    public String apiKey;
    public SourceGoogleWebfonts withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prettyPrint")
    public String prettyPrint;
    public SourceGoogleWebfonts withPrettyPrint(String prettyPrint) {
        this.prettyPrint = prettyPrint;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    public String sort;
    public SourceGoogleWebfonts withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
}
