package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceTwilioTaskrouterTwilioTaskrouterEnum {
    TWILIO_TASKROUTER("twilio-taskrouter");

    @JsonValue
    public final String value;

    private SourceTwilioTaskrouterTwilioTaskrouterEnum(String value) {
        this.value = value;
    }
}
