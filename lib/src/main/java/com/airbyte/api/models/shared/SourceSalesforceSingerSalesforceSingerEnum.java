package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceSalesforceSingerSalesforceSingerEnum {
    SALESFORCE_SINGER("salesforce-singer");

    @JsonValue
    public final String value;

    private SourceSalesforceSingerSalesforceSingerEnum(String value) {
        this.value = value;
    }
}
