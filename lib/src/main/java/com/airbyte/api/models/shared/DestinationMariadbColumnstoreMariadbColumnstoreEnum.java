package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationMariadbColumnstoreMariadbColumnstoreEnum {
    MARIADB_COLUMNSTORE("mariadb-columnstore");

    @JsonValue
    public final String value;

    private DestinationMariadbColumnstoreMariadbColumnstoreEnum(String value) {
        this.value = value;
    }
}
