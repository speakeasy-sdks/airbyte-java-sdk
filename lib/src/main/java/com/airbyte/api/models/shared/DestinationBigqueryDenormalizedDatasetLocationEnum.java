package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DestinationBigqueryDenormalizedDatasetLocationEnum {
    US("US"),
    EU("EU"),
    ASIA_EAST1("asia-east1"),
    ASIA_EAST2("asia-east2"),
    ASIA_NORTHEAST1("asia-northeast1"),
    ASIA_NORTHEAST2("asia-northeast2"),
    ASIA_NORTHEAST3("asia-northeast3"),
    ASIA_SOUTH1("asia-south1"),
    ASIA_SOUTH2("asia-south2"),
    ASIA_SOUTHEAST1("asia-southeast1"),
    ASIA_SOUTHEAST2("asia-southeast2"),
    AUSTRALIA_SOUTHEAST1("australia-southeast1"),
    AUSTRALIA_SOUTHEAST2("australia-southeast2"),
    EUROPE_CENTRAL2("europe-central2"),
    EUROPE_NORTH1("europe-north1"),
    EUROPE_WEST1("europe-west1"),
    EUROPE_WEST2("europe-west2"),
    EUROPE_WEST3("europe-west3"),
    EUROPE_WEST4("europe-west4"),
    EUROPE_WEST6("europe-west6"),
    NORTHAMERICA_NORTHEAST1("northamerica-northeast1"),
    NORTHAMERICA_NORTHEAST2("northamerica-northeast2"),
    SOUTHAMERICA_EAST1("southamerica-east1"),
    SOUTHAMERICA_WEST1("southamerica-west1"),
    US_CENTRAL1("us-central1"),
    US_EAST1("us-east1"),
    US_EAST4("us-east4"),
    US_WEST1("us-west1"),
    US_WEST2("us-west2"),
    US_WEST3("us-west3"),
    US_WEST4("us-west4");

    @JsonValue
    public final String value;

    private DestinationBigqueryDenormalizedDatasetLocationEnum(String value) {
        this.value = value;
    }
}
