package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionNoCompression
 * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".jsonl.gz").
**/
public class DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionNoCompression {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_type")
    public DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionNoCompressionCompressionTypeEnum compressionType;
    public DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionNoCompression withCompressionType(DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionNoCompressionCompressionTypeEnum compressionType) {
        this.compressionType = compressionType;
        return this;
    }
    
}
