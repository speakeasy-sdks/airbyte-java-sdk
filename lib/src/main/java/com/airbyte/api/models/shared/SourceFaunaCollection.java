package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFaunaCollection
 * Settings for the Fauna Collection.
**/
public class SourceFaunaCollection {
    @JsonProperty("deletions")
    public Object deletions;
    public SourceFaunaCollection withDeletions(Object deletions) {
        this.deletions = deletions;
        return this;
    }
    
    @JsonProperty("page_size")
    public Long pageSize;
    public SourceFaunaCollection withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
}
