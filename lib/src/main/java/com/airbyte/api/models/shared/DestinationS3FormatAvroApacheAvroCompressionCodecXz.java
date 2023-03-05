package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatAvroApacheAvroCompressionCodecXz
 * The compression algorithm used to compress data. Default to no compression.
**/
public class DestinationS3FormatAvroApacheAvroCompressionCodecXz {
    @JsonProperty("codec")
    public DestinationS3FormatAvroApacheAvroCompressionCodecXzCodecEnum codec;
    public DestinationS3FormatAvroApacheAvroCompressionCodecXz withCodec(DestinationS3FormatAvroApacheAvroCompressionCodecXzCodecEnum codec) {
        this.codec = codec;
        return this;
    }
    
    @JsonProperty("compression_level")
    public Long compressionLevel;
    public DestinationS3FormatAvroApacheAvroCompressionCodecXz withCompressionLevel(Long compressionLevel) {
        this.compressionLevel = compressionLevel;
        return this;
    }
    
}
