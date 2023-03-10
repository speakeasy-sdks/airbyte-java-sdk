package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatAvroApacheAvroCompressionCodecDeflate
 * The compression algorithm used to compress data. Default to no compression.
**/
public class DestinationS3FormatAvroApacheAvroCompressionCodecDeflate {
    @JsonProperty("codec")
    public DestinationS3FormatAvroApacheAvroCompressionCodecDeflateCodecEnum codec;
    public DestinationS3FormatAvroApacheAvroCompressionCodecDeflate withCodec(DestinationS3FormatAvroApacheAvroCompressionCodecDeflateCodecEnum codec) {
        this.codec = codec;
        return this;
    }
    
    @JsonProperty("compression_level")
    public Long compressionLevel;
    public DestinationS3FormatAvroApacheAvroCompressionCodecDeflate withCompressionLevel(Long compressionLevel) {
        this.compressionLevel = compressionLevel;
        return this;
    }
    
}
