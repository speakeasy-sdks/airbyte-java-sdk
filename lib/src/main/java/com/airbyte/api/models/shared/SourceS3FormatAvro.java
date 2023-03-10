package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceS3FormatAvro
 * This connector utilises <a href="https://fastavro.readthedocs.io/en/latest/" target="_blank">fastavro</a> for Avro parsing.
**/
public class SourceS3FormatAvro {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filetype")
    public SourceS3FormatAvroFiletypeEnum filetype;
    public SourceS3FormatAvro withFiletype(SourceS3FormatAvroFiletypeEnum filetype) {
        this.filetype = filetype;
        return this;
    }
    
}
