package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionGZIP
 * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".jsonl.gz").
**/
public class DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionGZIP {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_type")
    public DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionTypeEnum compressionType;
    public DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionGZIP withCompressionType(DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionTypeEnum compressionType) {
        this.compressionType = compressionType;
        return this;
    }
    
}
