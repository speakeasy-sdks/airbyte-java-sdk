package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationAzureBlobStorageFormatCSVCommaSeparatedValues
 * Output data format
**/
public class DestinationAzureBlobStorageFormatCSVCommaSeparatedValues {
    @JsonProperty("flattening")
    public DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesNormalizationFlatteningEnum flattening;
    public DestinationAzureBlobStorageFormatCSVCommaSeparatedValues withFlattening(DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesNormalizationFlatteningEnum flattening) {
        this.flattening = flattening;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesFormatTypeEnum formatType;
    public DestinationAzureBlobStorageFormatCSVCommaSeparatedValues withFormatType(DestinationAzureBlobStorageFormatCSVCommaSeparatedValuesFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
}
