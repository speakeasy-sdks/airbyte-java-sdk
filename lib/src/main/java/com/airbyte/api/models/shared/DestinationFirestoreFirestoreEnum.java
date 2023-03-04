package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationFirestoreFirestoreEnum {
    FIRESTORE("firestore");

    @JsonValue
    public final String value;

    private DestinationFirestoreFirestoreEnum(String value) {
        this.value = value;
    }
}
