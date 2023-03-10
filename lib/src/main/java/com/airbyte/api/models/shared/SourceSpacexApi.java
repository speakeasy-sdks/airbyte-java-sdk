package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSpacexApi
 * The values required to configure the source.
**/
public class SourceSpacexApi {
    @JsonProperty("airbyte-source-name")
    public SourceSpacexApiSpacexApiEnum airbyteSourceName;
    public SourceSpacexApi withAirbyteSourceName(SourceSpacexApiSpacexApiEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public SourceSpacexApi withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public String options;
    public SourceSpacexApi withOptions(String options) {
        this.options = options;
        return this;
    }
    
}
