package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SourceIp2whoisIp2whoisEnum {
    IP2WHOIS("ip2whois");

    @JsonValue
    public final String value;

    private SourceIp2whoisIp2whoisEnum(String value) {
        this.value = value;
    }
}
