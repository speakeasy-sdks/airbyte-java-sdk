package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceKustomerSingerKustomerSingerEnum {
    KUSTOMER_SINGER("kustomer-singer");

    @JsonValue
    public final String value;

    private SourceKustomerSingerKustomerSingerEnum(String value) {
        this.value = value;
    }
}
