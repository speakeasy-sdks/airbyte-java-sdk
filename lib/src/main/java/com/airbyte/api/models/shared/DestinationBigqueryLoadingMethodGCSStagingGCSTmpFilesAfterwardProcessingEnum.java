package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationBigqueryLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessingEnum {
    DELETE_ALL_TMP_FILES_FROM_GCS("Delete all tmp files from GCS"),
    KEEP_ALL_TMP_FILES_IN_GCS("Keep all tmp files in GCS");

    @JsonValue
    public final String value;

    private DestinationBigqueryLoadingMethodGCSStagingGCSTmpFilesAfterwardProcessingEnum(String value) {
        this.value = value;
    }
}
