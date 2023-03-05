package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceS3FormatJsonl
 * This connector uses <a href="https://arrow.apache.org/docs/python/json.html" target="_blank">PyArrow</a> for JSON Lines (jsonl) file parsing.
**/
public class SourceS3FormatJsonl {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("block_size")
    public Long blockSize;
    public SourceS3FormatJsonl withBlockSize(Long blockSize) {
        this.blockSize = blockSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filetype")
    public SourceS3FormatJsonlFiletypeEnum filetype;
    public SourceS3FormatJsonl withFiletype(SourceS3FormatJsonlFiletypeEnum filetype) {
        this.filetype = filetype;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("newlines_in_values")
    public Boolean newlinesInValues;
    public SourceS3FormatJsonl withNewlinesInValues(Boolean newlinesInValues) {
        this.newlinesInValues = newlinesInValues;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unexpected_field_behavior")
    public Object unexpectedFieldBehavior;
    public SourceS3FormatJsonl withUnexpectedFieldBehavior(Object unexpectedFieldBehavior) {
        this.unexpectedFieldBehavior = unexpectedFieldBehavior;
        return this;
    }
    
}
