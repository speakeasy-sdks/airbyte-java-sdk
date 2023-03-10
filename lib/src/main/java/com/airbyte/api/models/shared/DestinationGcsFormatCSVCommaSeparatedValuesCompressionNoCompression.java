package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatCSVCommaSeparatedValuesCompressionNoCompression
 * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
**/
public class DestinationGcsFormatCSVCommaSeparatedValuesCompressionNoCompression {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_type")
    public DestinationGcsFormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionTypeEnum compressionType;
    public DestinationGcsFormatCSVCommaSeparatedValuesCompressionNoCompression withCompressionType(DestinationGcsFormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionTypeEnum compressionType) {
        this.compressionType = compressionType;
        return this;
    }
    
}
