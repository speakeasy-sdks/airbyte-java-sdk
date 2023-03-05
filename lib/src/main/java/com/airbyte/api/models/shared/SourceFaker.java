package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFaker
 * The values required to configure the source.
**/
public class SourceFaker {
    @JsonProperty("airbyte-source-name")
    public SourceFakerFakerEnum airbyteSourceName;
    public SourceFaker withAirbyteSourceName(SourceFakerFakerEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("count")
    public Long count;
    public SourceFaker withCount(Long count) {
        this.count = count;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parallelism")
    public Long parallelism;
    public SourceFaker withParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("records_per_slice")
    public Long recordsPerSlice;
    public SourceFaker withRecordsPerSlice(Long recordsPerSlice) {
        this.recordsPerSlice = recordsPerSlice;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("records_per_sync")
    public Long recordsPerSync;
    public SourceFaker withRecordsPerSync(Long recordsPerSync) {
        this.recordsPerSync = recordsPerSync;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("seed")
    public Long seed;
    public SourceFaker withSeed(Long seed) {
        this.seed = seed;
        return this;
    }
    
}
