package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatAvroApacheAvroCompressionCodecDeflate
 * The compression algorithm used to compress data. Default to no compression.
**/
public class DestinationGcsFormatAvroApacheAvroCompressionCodecDeflate {
    @JsonProperty("codec")
    public DestinationGcsFormatAvroApacheAvroCompressionCodecDeflateCodecEnum codec;
    public DestinationGcsFormatAvroApacheAvroCompressionCodecDeflate withCodec(DestinationGcsFormatAvroApacheAvroCompressionCodecDeflateCodecEnum codec) {
        this.codec = codec;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_level")
    public Long compressionLevel;
    public DestinationGcsFormatAvroApacheAvroCompressionCodecDeflate withCompressionLevel(Long compressionLevel) {
        this.compressionLevel = compressionLevel;
        return this;
    }
    
}
