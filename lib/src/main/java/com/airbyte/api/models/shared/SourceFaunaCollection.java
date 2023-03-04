package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFaunaCollection
 * Settings for the Fauna Collection.
**/
public class SourceFaunaCollection {
    @JsonProperty("deletions")
    public java.util.Map<String, Object> deletions;
    public SourceFaunaCollection withDeletions(java.util.Map<String, Object> deletions) {
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
