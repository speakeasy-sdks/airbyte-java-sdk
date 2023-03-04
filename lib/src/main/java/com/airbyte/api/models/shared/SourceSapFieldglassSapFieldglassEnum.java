package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSapFieldglassSapFieldglassEnum {
    SAP_FIELDGLASS("sap-fieldglass");

    @JsonValue
    public final String value;

    private SourceSapFieldglassSapFieldglassEnum(String value) {
        this.value = value;
    }
}
