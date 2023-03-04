package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JobsResponse {
    @JsonProperty("data")
    public JobResponse[] data;
    public JobsResponse withData(JobResponse[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("next")
    public String next;
    public JobsResponse withNext(String next) {
        this.next = next;
        return this;
    }
    
    @JsonProperty("previous")
    public String previous;
    public JobsResponse withPrevious(String previous) {
        this.previous = previous;
        return this;
    }
    
}
