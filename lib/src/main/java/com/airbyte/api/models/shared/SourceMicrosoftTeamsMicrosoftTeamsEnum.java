package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceMicrosoftTeamsMicrosoftTeamsEnum {
    MICROSOFT_TEAMS("microsoft-teams");

    @JsonValue
    public final String value;

    private SourceMicrosoftTeamsMicrosoftTeamsEnum(String value) {
        this.value = value;
    }
}
