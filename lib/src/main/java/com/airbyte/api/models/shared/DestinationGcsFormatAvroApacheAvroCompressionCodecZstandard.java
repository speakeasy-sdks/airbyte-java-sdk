package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatAvroApacheAvroCompressionCodecZstandard
 * The compression algorithm used to compress data. Default to no compression.
**/
public class DestinationGcsFormatAvroApacheAvroCompressionCodecZstandard {
    @JsonProperty("codec")
    public DestinationGcsFormatAvroApacheAvroCompressionCodecZstandardCodecEnum codec;
    public DestinationGcsFormatAvroApacheAvroCompressionCodecZstandard withCodec(DestinationGcsFormatAvroApacheAvroCompressionCodecZstandardCodecEnum codec) {
        this.codec = codec;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_level")
    public Long compressionLevel;
    public DestinationGcsFormatAvroApacheAvroCompressionCodecZstandard withCompressionLevel(Long compressionLevel) {
        this.compressionLevel = compressionLevel;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_checksum")
    public Boolean includeChecksum;
    public DestinationGcsFormatAvroApacheAvroCompressionCodecZstandard withIncludeChecksum(Boolean includeChecksum) {
        this.includeChecksum = includeChecksum;
        return this;
    }
    
}
