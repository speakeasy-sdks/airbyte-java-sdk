package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceApifyDataset
 * The values required to configure the source.
**/
public class SourceApifyDataset {
    @JsonProperty("airbyte-source-name")
    public SourceApifyDatasetApifyDatasetEnum airbyteSourceName;
    public SourceApifyDataset withAirbyteSourceName(SourceApifyDatasetApifyDatasetEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("clean")
    public Boolean clean;
    public SourceApifyDataset withClean(Boolean clean) {
        this.clean = clean;
        return this;
    }
    
    @JsonProperty("datasetId")
    public String datasetId;
    public SourceApifyDataset withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
}
