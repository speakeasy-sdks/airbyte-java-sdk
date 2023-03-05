package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatAvroApacheAvroCompressionCodecXz
 * The compression algorithm used to compress data. Default to no compression.
**/
public class DestinationGcsFormatAvroApacheAvroCompressionCodecXz {
    @JsonProperty("codec")
    public DestinationGcsFormatAvroApacheAvroCompressionCodecXzCodecEnum codec;
    public DestinationGcsFormatAvroApacheAvroCompressionCodecXz withCodec(DestinationGcsFormatAvroApacheAvroCompressionCodecXzCodecEnum codec) {
        this.codec = codec;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_level")
    public Long compressionLevel;
    public DestinationGcsFormatAvroApacheAvroCompressionCodecXz withCompressionLevel(Long compressionLevel) {
        this.compressionLevel = compressionLevel;
        return this;
    }
    
}
