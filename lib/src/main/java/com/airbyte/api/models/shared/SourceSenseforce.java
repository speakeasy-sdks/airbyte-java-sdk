package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class SourceSenseforce {
    @JsonProperty("access_token")
    public String accessToken;
    public SourceSenseforce withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceSenseforceSenseforceEnum airbyteSourceName;
    public SourceSenseforce withAirbyteSourceName(SourceSenseforceSenseforceEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("backend_url")
    public String backendUrl;
    public SourceSenseforce withBackendUrl(String backendUrl) {
        this.backendUrl = backendUrl;
        return this;
    }
    
    @JsonProperty("dataset_id")
    public String datasetId;
    public SourceSenseforce withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("slice_range")
    public Long sliceRange;
    public SourceSenseforce withSliceRange(Long sliceRange) {
        this.sliceRange = sliceRange;
        return this;
    }
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceSenseforce withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
