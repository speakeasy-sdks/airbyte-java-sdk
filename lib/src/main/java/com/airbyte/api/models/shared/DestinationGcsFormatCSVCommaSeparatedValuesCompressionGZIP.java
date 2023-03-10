package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatCSVCommaSeparatedValuesCompressionGZIP
 * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
**/
public class DestinationGcsFormatCSVCommaSeparatedValuesCompressionGZIP {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_type")
    public DestinationGcsFormatCSVCommaSeparatedValuesCompressionGZIPCompressionTypeEnum compressionType;
    public DestinationGcsFormatCSVCommaSeparatedValuesCompressionGZIP withCompressionType(DestinationGcsFormatCSVCommaSeparatedValuesCompressionGZIPCompressionTypeEnum compressionType) {
        this.compressionType = compressionType;
        return this;
    }
    
}
