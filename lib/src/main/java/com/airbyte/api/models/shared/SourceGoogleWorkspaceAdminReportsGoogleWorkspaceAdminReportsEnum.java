package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceGoogleWorkspaceAdminReportsGoogleWorkspaceAdminReportsEnum {
    GOOGLE_WORKSPACE_ADMIN_REPORTS("google-workspace-admin-reports");

    @JsonValue
    public final String value;

    private SourceGoogleWorkspaceAdminReportsGoogleWorkspaceAdminReportsEnum(String value) {
        this.value = value;
    }
}
